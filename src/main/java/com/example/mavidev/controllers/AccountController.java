package com.example.mavidev.controllers;

import com.example.mavidev.entities.Account;
import com.example.mavidev.services.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AccountController {
    @Autowired
    private AccountServiceImpl accountServiceImpl;

    @GetMapping("/")
    public String viewHomePage() {
        return "index";
    }
    @GetMapping("/accountlist")
    public String viewHomePage(Model model) {
        model.addAttribute("allaccountlist", accountServiceImpl.getAllAccount());
        return "accountlist";
    }
    @GetMapping("/addnew")
    public String addNewAccount(Model model) {
        Account account = new Account();
        model.addAttribute("account", account);
        return "newaccount";
    }
    @PostMapping("/save")
    public String saveAccount(@ModelAttribute("account") Account account) {
        accountServiceImpl.save(account);
        return "redirect:/accountlist";
    }

}
