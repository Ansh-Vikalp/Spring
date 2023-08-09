package com.wipro.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMain {
    public static void main(String[] args) {
        /*
         * In Normal the Related Class (Usermain) creates and maintains every objects of
         * busigness beans
         * so, when no of Objects increases as application grows result in increase in
         * complexity
         * This is called as tight coupling or dependent of class
         * This overhead removed by the use of Spring which takes responsibility to
         * create and deliver objects of diffrent beans to Related class
         * 
         * Delivering of Objects and its resources <values of attribues and meathod> to
         * related class is what called as DEPENDENCY Injection.
         * 
         * Ans the context specified in bean.xml file is the main boss for managing
         * Busigness Objects and their relations even they are independent modules
         * 
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld obj = context.getBean(HelloWorld.class);
        obj.display();
        ((ConfigurableApplicationContext) context).close();

    }
}
