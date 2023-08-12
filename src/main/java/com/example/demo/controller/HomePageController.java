package com.example.demo.controller;

import com.example.demo.entity.Account;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.AccountService;

import java.util.Optional;

@Controller
//@SessionAttributes("acc")
public class HomePageController {
    @Autowired
    private AccountService accountService;

//    @ModelAttribute("acc")
//    public Account account() {
//        return new Account();
//    }

    @GetMapping("/home")
    public String homePage() {
        System.out.println("gédbvfihdsvofsjbfjdkdf");
        return "homePage";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String logged(@RequestParam String username, @RequestParam String password, Model model, HttpSession session) {
        Optional<Account> account = accountService.findByUsernameAndPassword(username, password);
        if (account.isEmpty()) {
            throw new RuntimeException("Sai tên đăng nhập hoặc mật khẩu");
        }
        model.addAttribute("username", username);
        model.addAttribute("password", password);
        session.setAttribute("login", model);
        return "homeLogged";
    }
}

