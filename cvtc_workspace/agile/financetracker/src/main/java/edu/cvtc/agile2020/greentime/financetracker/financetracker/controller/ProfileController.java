package edu.cvtc.agile2020.greentime.financetracker.financetracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
//@RequestMapping("profile")
@RequestMapping(value="/profile", method = RequestMethod.POST)
public class ProfileController {
    @GetMapping("index")
    public String index(){
        return "profile/index";
    }
}
