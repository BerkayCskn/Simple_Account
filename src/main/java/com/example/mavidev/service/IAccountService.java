package com.example.mavidev.service;

import com.example.mavidev.model.Account;

import java.util.List;

public interface IAccountService {
    List<Account> getAllAccount();
    void save(Account account);
}
