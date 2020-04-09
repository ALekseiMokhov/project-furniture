package com.gmail.qwertygoog.Project.furniture.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String getHome(ModelMap m) {
        m.addAttribute( "message",
                "Establish your own comfort with us" );
        return "home/home";
    }

}
