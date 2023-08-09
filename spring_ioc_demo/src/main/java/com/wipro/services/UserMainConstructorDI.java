package com.wipro.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.bean.Employee;

public class UserMainConstructorDI {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-consdi.xml");
        Employee e2 = context.getBean(Employee.class);

        System.out.println("\n\n" + e2 + "\n\n");

        ((ConfigurableApplicationContext) context).close();

    }
}
