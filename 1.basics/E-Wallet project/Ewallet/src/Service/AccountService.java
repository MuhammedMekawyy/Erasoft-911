package Service;

import model.Account;

public interface AccountService {

    boolean createAccount(Account account);

    Account isAccountExist(Account account);

    void deleteAccount(Account account);

    void changeExistPassword (Account account , String newPassword ,String oldPassword);

    void deposit(Account account , double depositAmount);

    void withdraw(Account account,double withdrawAmount);

    boolean isUsernameExists(String destinationUsername);

    void transfer(Account account,String destinationUsername,double amount);

}
