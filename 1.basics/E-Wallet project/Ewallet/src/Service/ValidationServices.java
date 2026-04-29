package Service;

import model.Account;

public interface ValidationServices {

    boolean isAgeValid(float age);

    boolean isPasswordValid(String password);

    boolean isUsernameValid(String username);

    boolean isPhoneNumberValid(String PhoneNumber);

    void validateAccount(Account account);

    void validateAmount(double amount);




}
