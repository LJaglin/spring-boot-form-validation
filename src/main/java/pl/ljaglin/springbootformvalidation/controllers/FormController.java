package pl.ljaglin.springbootformvalidation.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.ljaglin.springbootformvalidation.models.Person;

import javax.validation.Valid;

@Controller
public class FormController {

    @GetMapping("/")
    public String showForm(Person person) {
        return "form";
    }

    @PostMapping("/")
    public String checkPersonInfo(@Valid Person person, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "form";
        }

        return "redirect:/result";
    }
}
