package com.example.mavidev.service;

import com.example.mavidev.model.Account;
import com.example.mavidev.repository.IAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountRepository IAccountRepository;

    @Override
    public List<Account> getAllAccount() {
        return IAccountRepository.findAll();
    }

    @Override
    public void save(Account account) {
        IAccountRepository.save(account);
    }
}
