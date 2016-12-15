package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by b_nop on 15.12.2016.
 */
@Controller
@RequestMapping(value="/valid")
public class HelloController {

    @RequestMapping(method= RequestMethod.GET)
    public String loadFormPage(Model m) {
        m.addAttribute("user", new User());
        return "hello";
    }

    @RequestMapping(method=RequestMethod.POST)
    public String submitForm(@Valid User user, BindingResult result, Model m) {
        if(result.hasErrors()) {
            return "hello";
        }

        m.addAttribute("message", "Successfully saved User!");
        return "hello";
    }

}