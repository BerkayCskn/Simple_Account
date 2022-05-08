package com.example.mavidev.controller;

import com.example.mavidev.model.Account;
import com.example.mavidev.service.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
