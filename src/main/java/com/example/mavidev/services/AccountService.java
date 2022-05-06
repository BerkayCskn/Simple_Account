package com.example.mavidev.services;

import com.example.mavidev.entities.Account;

import java.util.List;

public interface AccountService {
    List<Account> getAllAccount();
    void save(Account account);
}
