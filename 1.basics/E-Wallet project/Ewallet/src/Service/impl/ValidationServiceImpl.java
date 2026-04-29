package Service.impl;

import Exceptions.AccountNotFoundException;
import Exceptions.InvalidAmountException;
import Service.ValidationServices;
import model.Account;

public class ValidationServiceImpl implements ValidationServices {

    @Override
    public boolean isAgeValid(float age) {
        return age >= 18;
    }

    @Override
    public boolean isPasswordValid(String password) {
        if(password.isBlank())
            return false;

        if (password.length() < 8)
            return false;

        if( !Character.isLetter(password.charAt(0)) )
            return false;

        boolean hasUppercase=false;
        boolean hasLowercase=false;
        boolean hasDigit=false;
        boolean hasSpecialChar=false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowercase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else {
                hasSpecialChar = true;
            }
        }

        return  hasLowercase && hasUppercase && hasDigit && hasSpecialChar ;

    }

    @Override
    public boolean isUsernameValid(String userName) {

        if (userName == null || userName.isBlank()) {
            return false;
        }

        if (userName.length() < 3) {
            return false;
        }

        // must start with a letter
        if (!Character.isLetter(userName.charAt(0))) {
            return false;
        }

        // must start with uppercase
        if (!Character.isUpperCase(userName.charAt(0))) {
            return false;
        }

        // must NOT contain digits
        for (char c : userName.toCharArray()) {
            if (Character.isDigit(c)) {
                return false;
            }
        }

        return true;
    }

    @Override
    public boolean isPhoneNumberValid(String phoneNumber) {

        if (phoneNumber == null || phoneNumber.isBlank()) {
            System.out.println("Phone number cannot be empty.");
            return false;
        }

        // must be numeric only
        for (char c : phoneNumber.toCharArray()) {
            if (!Character.isDigit(c)) {
                System.out.println("Phone number must contain only digits.");
                return false;
            }
        }

        // must be 11 digits
        if (phoneNumber.length() != 11) {
            System.out.println("Phone number must be exactly 11 digits.");
            return false;
        }

        // matching Egyptian numbers
        if (!(phoneNumber.startsWith("010") ||
                phoneNumber.startsWith("011") ||
                phoneNumber.startsWith("012") ||
                phoneNumber.startsWith("015"))) {

            System.out.println("Invalid Egyptian phone number prefix.");
            return false;
        }

        return true;
    }


    @Override
    public void validateAmount(double amount) {
        if (amount < 100) {
            throw new InvalidAmountException("Amount must be at least 100");
        }

        if (amount % 100 != 0) {
            throw new InvalidAmountException("Amount must be in multiples of 100 (100, 200, ...)");
        }
    }

    @Override
    public void validateAccount(Account account) {
        if (account == null) {
            throw new AccountNotFoundException("Account is null");
        }
    }

}
