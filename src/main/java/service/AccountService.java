package service;

import dto.AccountDTO;
import entity.Account;

import java.util.List;

public interface AccountService {
    List<Account> getAll();
}
