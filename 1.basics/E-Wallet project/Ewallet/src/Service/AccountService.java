package Service;

import model.Account;

public interface AccountService {
    boolean createAccount(Account account);
    boolean isAccountExist(Account account);

}
