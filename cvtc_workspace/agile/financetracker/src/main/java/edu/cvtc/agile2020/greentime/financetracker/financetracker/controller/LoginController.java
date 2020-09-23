package edu.cvtc.agile2020.greentime.financetracker.financetracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/", method = RequestMethod.POST)
public class LoginController {

    @GetMapping("/login.html")
    public String login() {
        return "login.html";
    }
}

