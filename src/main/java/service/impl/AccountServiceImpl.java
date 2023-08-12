package service.impl;

import entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AccountRepository;
import service.AccountService;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public List<Account> getAll() {
        return accountRepository.findAccountByIdAccount();
    }

    @Override
    public Account findById(int id) {
        return accountRepository.getById(id);
    }

    @Override
    public void create(Account account) {
        accountRepository.save(account);
    }

    @Override
    public Account update(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public void delete(int id) {
        accountRepository.deleteById(id);
    }
}
