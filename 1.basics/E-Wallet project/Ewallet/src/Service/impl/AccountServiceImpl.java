package Service.impl;

import Exceptions.AccountNotFoundException;
import Exceptions.InsufficientBalanceException;
import Service.AccountService;
import Service.ValidationServices;
import model.Account;
import model.EwalletSystem;

import java.util.Optional;

public class AccountServiceImpl implements AccountService {

    EwalletSystem ewalletSystem =new EwalletSystem();
    ValidationServices validationServices =new ValidationServiceImpl();

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
    public Account isAccountExist(Account account) {

        Optional<Account> optionalAccount =  findByUsernameAndPassword(account);

        return optionalAccount.orElse(null);

    }

    @Override
    public void deleteAccount(Account account) {

       boolean isAccountDeleted = ewalletSystem.getAccounts().
                removeIf(acc-> acc.getUserName().equals(account.getUserName()) &&
                acc.getPassword().equals(account.getPassword()));
       if(isAccountDeleted)
           System.out.println("Account Deleted Successfully");
       else
           System.out.println("Failed");

    }

    @Override
    public void changeExistPassword(Account account, String newPassword ,String oldPassword) {

        Optional<Account> optionalAccount= findByUsername(account.getUserName());

        if(optionalAccount.isPresent()){

            Account existAccount=optionalAccount.get();

            if (!existAccount.getPassword().equals(oldPassword)) {
                System.out.println("Old password is incorrect.");
                return;
            }

            if(existAccount.getPassword().equals(newPassword)) {
                System.out.println("This is the current password pls enter new password");
                return;
            }
            existAccount.setPassword(newPassword);
            System.out.println("Password changed successfully.");
        }
        else
            System.out.println("Failed");

    }

    private Optional<Account> findByUsernameAndPassword(Account account){

      return ewalletSystem.getAccounts().stream()
                .filter(acc-> acc.getUserName().equals(account.getUserName()) &&
                        acc.getPassword().equals(account.getPassword())).findFirst();
    }

    private Optional<Account> findByUsername(String username){
        return ewalletSystem.getAccounts().stream()
                .filter(acc-> acc.getUserName().equals(username)).
                findFirst();
    }

    @Override
    public void deposit(Account account, double depositAmount) {

        validationServices.validateAccount(account);
        validationServices.validateAmount(depositAmount);

        Account existAccount = findByUsername(account.getUserName())
                .orElseThrow(() -> new AccountNotFoundException("Account not found"));

        performDeposit(existAccount, depositAmount);

        System.out.println("Deposit successful. New balance: " + existAccount.getBalance());
    }

    @Override
    public void withdraw(Account account, double withdrawAmount) {

        validationServices.validateAccount(account);
        validationServices.validateAmount(withdrawAmount);

        Account existAccount = findByUsername(account.getUserName())
                .orElseThrow(() -> new AccountNotFoundException("Account not found"));

        performWithdraw(existAccount, withdrawAmount);

        System.out.println("Withdrawal successful. New balance: " + existAccount.getBalance());
    }

    @Override
    public boolean isUsernameExists(String username) {
        return ewalletSystem.getAccounts().stream()
                .anyMatch(acc -> acc.getUserName().equals(username));
    }

    @Override
    public void transfer(Account account, String destinationUsername, double amount) {

        validationServices.validateAccount(account);
        validationServices.validateAmount(amount);

        Account sender = findByUsername(account.getUserName())
                .orElseThrow(() -> new AccountNotFoundException("Sender account not found"));

        Account receiver = findByUsername(destinationUsername)
                .orElseThrow(() -> new AccountNotFoundException("Destination account not found"));

        if (sender.getUserName().equals(receiver.getUserName())) {
            System.out.println("You cannot transfer to yourself.");
            return;
        }

        performWithdraw(sender, amount);
        performDeposit(receiver, amount);

        System.out.println("Transfer successful. Your new balance: " + sender.getBalance());
    }

    private void performDeposit(Account account, double amount)
    {
        account.setBalance(account.getBalance() + amount);
    }

    private void performWithdraw(Account account, double amount) {
        if (account.getBalance() < amount) {
            throw new InsufficientBalanceException("Insufficient balance");
        }
        account.setBalance(account.getBalance() - amount);
    }


}
