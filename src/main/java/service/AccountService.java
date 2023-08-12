package service;

import dto.AccountDTO;
import entity.Account;

import java.util.List;
import java.util.Optional;

public interface AccountService {
    List<Account> getAll();
    Optional<Account> findById(int id);
    Optional<Account> findByUsernameAndPassword(String username, String password);
    void create(Account account);
    Account update(Account account);
    void delete(int id);
}
