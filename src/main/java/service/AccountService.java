package service;

import dto.AccountDTO;
import entity.Account;

import java.util.List;

public interface AccountService {
    List<Account> getAll();
    Account findById(int id);
    void create(Account account);
    Account update(Account account);
    void delete(int id);
}
