package pl.ljaglin.springbootformvalidation.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FormController {

    @RequestMapping(value="")
    @ResponseBody
    public String sayHello() {
        return "Hello!";
    }

    @GetMapping("form")
    public String showForm() {
        return "form";
    }
}
