package com.example.friendlist.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.friendlist.domain.Greeting;

@Controller
public class GreetingController {

    @GetMapping("/index")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "index";
    }

    @PostMapping("/index")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
        return "index";
    }

}
