package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomePageController {
    @GetMapping("/home")
    public String homePage() {
        return "homePage";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}

