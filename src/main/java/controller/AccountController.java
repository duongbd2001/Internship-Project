package controller;

import entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.AccountService;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping("/get-all")
    public String getAllAccount(Model model) {
        List<Account> listAccount = accountService.getAll();
        model.addAttribute("allAccount", listAccount);
        return null;
    }

    @GetMapping("/get-one/{id}")
    public String getOneAccount(@PathVariable("id") int id, Model model) {
        Account account = accountService.findById(id);
        model.addAttribute("account", account);
        return null;
    }

    @PostMapping("/create")
    public String createAccount(@ModelAttribute("createAccount") Account account) {
        accountService.create(account);
        return null;
    }

    @PutMapping("/update")
    public String updateAccount(@ModelAttribute("updateAccount") Account account) {
        accountService.update(account);
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteAccount(@PathVariable("id") int id) {
        accountService.delete(id);
        return null;
    }
}
