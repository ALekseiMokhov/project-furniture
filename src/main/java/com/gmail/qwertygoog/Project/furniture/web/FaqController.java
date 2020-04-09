package com.gmail.qwertygoog.Project.furniture.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/faq")
public class FaqController {
    @GetMapping
    String getFaq(){
        return "faq/faq";
    }
}
