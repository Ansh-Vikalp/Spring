package com.wipro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*Dispatcher-servlet selects an appropriate controller and delegates to it to handel the request. */
@Controller
public class HelloController {
    /*
     * Sepecific Requests(Url pattern: Hello in this case) are handeled as meathods
     * and these handler meathods are mapped to request using
     * 
     * @RequestMapping annotation
     */

    @RequestMapping("/Hello")
    public String helloMeathod() {
        return "HelloPage"; // returning view name from which we will render html page
    }

}
