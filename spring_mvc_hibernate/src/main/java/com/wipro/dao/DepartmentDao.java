package com.wipro.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.wipro.bean.Department;

@Repository
@Transactional

@SuppressWarnings("unchecked")
public class DepartmentDao {

    @Autowired
    SessionFactory sessionFactory;
    @Autowired
    HibernateTemplate hibernateTemplate;

    public int getDepartmentId() {
        Session session = sessionFactory.openSession();
        String hql = "Select max(d.deptno) from Department d";
        Query<Department> query = session.createQuery(hql);

        List<?> result = query.list();
        int id = 0;
        if (result != null && result.size() > 0) {
            Object ob = result.get(0);

            if (ob != null) {
                id = (Integer) ob;
            }
        }

        session.close();

        return id + 10;

    }

    public boolean insertDepartment(Department dept) {

        hibernateTemplate.persist(dept);

        return true;
    }

}
