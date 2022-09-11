package com.example.lab1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Lab1Controller {
    @GetMapping("/")
    @ResponseBody
    String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/max")
    String Max() {
        return "maksym.html";
    }

    @GetMapping("/ivanna")
    String Ivanna() {
        return "ivanna.html";
    }

    @GetMapping("/vitalii")
    String Vitalii() {
        return "vitalii.html";
    }

    @GetMapping("/team")
    String Team() {
        return "team.html";
    }
}
