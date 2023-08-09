package com.wipro.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.bean.Employee;

public class UserMainSetterDI {
    public static void main(String[] args) {
        /*
         * This will use beans-setdi-byName configuration file for automatically
         * injecting address obj to employee
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-setdi-byName.xml");
        Employee e1 = context.getBean(Employee.class);
        System.out.println("\n\n" + e1 + "\n\n");

        /*
         * This will use beans-setdi-byType configuration file for automatically
         * injecting address obj to employee
         */
        ApplicationContext context2 = new ClassPathXmlApplicationContext("beans-setdi-byType.xml");
        Employee e2 = context2.getBean(Employee.class);
        System.out.println("\n\n" + e2 + "\n\n");

        ((ConfigurableApplicationContext) context).close();
        ((ConfigurableApplicationContext) context2).close();

    }
}
