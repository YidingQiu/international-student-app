package com.studentlifeoz.international_student_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/job-search")
    public String jobSearch() {
        return "job_search";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}