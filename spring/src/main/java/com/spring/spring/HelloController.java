package com.spring.spring;

//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/")
//public class HelloController {
//    @GetMapping
//    public String hello() {
//        return "Hello from sam ";
//    }
//
//}
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello")

    public String hello(Model model) {
        model.addAttribute("message", "Hello from Sar");
        return "hello"; // This will map to hello.html in templates folder
    }
}