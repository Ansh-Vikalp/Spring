package com.wipro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.bean.Department;

@Controller
public class DepartmentController {

    @RequestMapping("/PreInsertDepartment")
    public ModelAndView preInsert() {

        Department myDept = new Department();
        myDept.setDeptno(40);

        ModelAndView mv = new ModelAndView("InsertDepartment", "department", myDept);

        return mv;
    }

    @RequestMapping("/InsertDepartment")
    // Entered Form data is now send to Controller through model Attribute and is
    // now available as dept Object.
    public ModelAndView insert(@ModelAttribute("department") Department dept) {

        ModelAndView mv = new ModelAndView("Result", "yourDept", dept);
        return mv;

    }
}
