package com.clubBike.clubBike.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {

    @GetMapping("/login")
    public String loginForm() {
        //ddd
        return "login";
    }
}
