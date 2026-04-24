package Service.impl;

import Service.AccountService;
import model.Account;
import model.EwalletSystem;

public class AccountServiceImpl implements AccountService {

    EwalletSystem ewalletSystem =new EwalletSystem();
    @Override
    public boolean createAccount(Account account) {
        boolean usernameExists = ewalletSystem.getAccounts().stream()
                .anyMatch(acc -> acc.getUserName().equals(account.getUserName()));

        boolean phoneExists = ewalletSystem.getAccounts().stream()
                .anyMatch(acc -> acc.getPhoneNumber().equals(account.getPhoneNumber()));

        if (usernameExists) {
            System.out.println("Account creation failed: Username is already in use.");
            return false;
        }

        if (phoneExists) {
            System.out.println("Account creation failed: Phone number is already registered.");
            return false;
        }
        ewalletSystem.getAccounts().add(account);
        return true;
    }

    @Override
    public boolean isAccountExist(Account account) {
      boolean isExist =  ewalletSystem.getAccounts().stream()
                .anyMatch(acc-> acc.getUserName().equals(account.getUserName())
                && acc.getPassword().equals(account.getPassword()));

        return isExist;

    }
}
