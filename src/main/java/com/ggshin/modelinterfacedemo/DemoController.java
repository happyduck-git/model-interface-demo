package com.ggshin.modelinterfacedemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    public String viewPage(Model model) {
        Member member = new Member("Anne-Marie");
        model.addAttribute("name", member.getUsername());

        return "demo";
    }

}
