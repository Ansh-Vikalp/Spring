package com.wipro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping("/Hello")
    public String helloMeathod() {
        return "hello";
    }

    @RequestMapping("/HelloWorld")
    public ModelAndView sayHello() {
        String msg = "Ansh Vikalp";
        ModelAndView mav = new ModelAndView("helloworld", "myMessage", msg);
        return mav;
    }
}
