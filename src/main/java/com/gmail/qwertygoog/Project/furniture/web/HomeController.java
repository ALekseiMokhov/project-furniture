package com.gmail.qwertygoog.Project.furniture.web;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
        @GetMapping("/")
        public String getHome() {

            return "home";
        }

}
