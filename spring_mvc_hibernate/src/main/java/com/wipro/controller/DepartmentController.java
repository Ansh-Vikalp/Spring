package com.wipro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.bean.Department;
import com.wipro.dao.DepartmentDao;

@Controller
public class DepartmentController {
    @Autowired
    DepartmentDao lodao;

    @RequestMapping("/PreInsertDepartment")
    public ModelAndView preInsert() {

        Department myDept = new Department();
        myDept.setDeptno(lodao.getDepartmentId());

        ModelAndView mv = new ModelAndView("InsertDepartment", "department", myDept);

        return mv;
    }

    @RequestMapping("/InsertDepartment")
    // Entered Form data is now send to Controller through model Attribute and is
    // now available as dept Object.
    public ModelAndView insert(@ModelAttribute("department") Department dept) {

        ModelAndView mv = new ModelAndView("Result", "yourDept", dept);
        if (lodao.insertDepartment(dept)) {

            mv.addObject("msg", "Inserted Successfully");
        } else {

            mv.addObject("msg", "Insert Failed");
        }

        return mv;

    }
}
