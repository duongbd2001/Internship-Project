package service.impl;

import entity.Account;
import org.springframework.stereotype.Service;
import repository.AccountRepository;
import service.AccountService;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    private AccountRepository accountRepository;

    @Override
    public List<Account> getAll() {
        return accountRepository.findAccountByIdAccount();
    }
}
