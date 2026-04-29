package Service.impl;
import Exceptions.AccountNotFoundException;
import Exceptions.InsufficientBalanceException;
import Exceptions.InvalidAmountException;
import Service.AccountService;
import Service.EwalletApplicationService;
import Service.HelperServices;
import Service.ValidationServices;
import model.Account;

import java.util.Objects;


public class EwalletApplicationServiceImpl implements EwalletApplicationService {

    private final AccountService accountService = new AccountServiceImpl();
    private final ValidationServices validationServices=new ValidationServiceImpl();
    private final HelperServices helperServices=new HelperServiceImpl();


    @Override
    public void start() {

        int number;
        int inValidCounter = 0;


        while (true) {

            System.out.println("========================================");
            System.out.println("        Welcome to EraSoft E-Wallet     ");
            System.out.println("========================================");
            System.out.println("1) Login");
            System.out.println("2) Sign Up");
            System.out.println("3) Exit");


            number =  helperServices.readInteger("Enter your choice: ");

                switch (number) {
                    case 1:
                        login();
                        break;

                    case 2:
                        signup();
                        break;

                    case 3:
                        System.out.println("Thank you for using EraSoft E-Wallet. Goodbye.");
                        return;

                    default:
                        System.out.println("Invalid choice");
                        inValidCounter++;
                        break;
                }

            if (inValidCounter > 3) {
                System.out.println("Maximum attempts exceeded. Access temporarily blocked.");
                break;
            }
        }
    }

    private void signup() {
        System.out.println("========================================");
        System.out.println("            Account Registration        ");
        System.out.println("========================================");


            String username = helperServices.readValidString("Enter username: ",
                    validationServices :: isUsernameValid,
                    "username must be not contain number. " +
                            "username must start with char. " +
                            "username must start with upper. " +
                            "username length can not be < 3 char. " +
                            "can not contain digits"
                    );
            if(username==null) return;



            String password = helperServices.readValidString(
                "Enter password: ",
                    validationServices :: isPasswordValid,
                "Invalid password. password should contain upper,lower case" +
                        ",digits and special char.and length must be > 8. "
            );
             if (password == null) return;


            String phoneNumber = helperServices.readValidString("Enter phone number: ",
                    validationServices :: isPhoneNumberValid,
                    "Invalid phone number. Must be 11 digits and start with 010, 011, 012, or 015."
                    );
            if(phoneNumber==null) return;


            float age = helperServices.readFloat("Enter age: ");

            if (!validationServices.isAgeValid(age)) {
                System.out.println("Registration failed: You must be at least 18 years old.");
                 return;
        }


            Account account = new Account(phoneNumber, password, username, age);
            boolean isAccountCreated = accountService.createAccount(account);

            if (isAccountCreated) {
                System.out.println("Registration completed successfully.");
            } else {
                System.out.println("Registration failed.");
            }

    }

    private void login() {

        int attempts = 0;

        while (attempts < 3) {

            String username = helperServices.readLine("Enter username: ");
            String password = helperServices.readLine("Enter password: ");

            Account account = new Account(username, password);
            account = accountService.isAccountExist(account);

            if (Objects.nonNull(account)) {
                System.out.println("\nLogin successful!");
                mainProfile(account);
                return;
            }

            attempts++;
            System.out.println("\nInvalid username or password. "
                    + (3-attempts) + " Attempts left");
        }

        System.out.println("\nToo many failed attempts. Access blocked.");
    }

    private void mainProfile(Account account) {

        boolean running = true;

        while (running) {

            System.out.println("========================================");
            System.out.println("            Main Menu        ");
            System.out.println("========================================");
            System.out.println("[1] Deposit");
            System.out.println("[2] Withdraw");
            System.out.println("[3] Transfer");
            System.out.println("[4] Show Profile Details");
            System.out.println("[5] Change Password");
            System.out.println("[6] Remove Account");
            System.out.println("[7] Logout");

            int feature = helperServices.readInteger("Please enter number of feature you want: ");

            switch (feature) {
                case 1:
                    deposit(account);
                    break;

                case 2:
                    withdraw(account);
                    break;

                case 3:
                    transfer(account);
                    break;

                case 4:
                    showProfile(account);
                    break;

                case 5:
                    changePassword(account);
                    break;

                case 6:
                    removeAccount(account);
                    running = false;
                    break;

                case 7:
                    System.out.println("Goodbye");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private void showProfile(Account account){
        System.out.println("=================================");
        System.out.println("           Account Data          ");
        System.out.println("=================================\n");

        System.out.println("Username: " + account.getUserName());
        System.out.println("Password: " + helperServices.maskPassword(account.getPassword()));
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Phone Number: " + account.getPhoneNumber());
        System.out.println("Age: " + account.getAge());


    }

    private void removeAccount(Account account){
       accountService.deleteAccount(account);
    }

    private void changePassword(Account account){

        String oldPassword = helperServices.readLine("Enter old password: ");

        String newPassword = helperServices.readValidString(
                "Enter new password: ",
                validationServices :: isPasswordValid,
                "Invalid password. password should contain upper,lower case" +
                        ",digits and special char.and length must be > 8. "
        );
        if (newPassword == null) return;

        accountService.changeExistPassword(account,newPassword,oldPassword);

    }

    private void deposit(Account account) {

        double depositAmount = helperServices.readDouble("Enter deposit amount: ");

        try {
            accountService.deposit(account, depositAmount);
        } catch (InvalidAmountException |
                 AccountNotFoundException e) {

            System.out.println(e.getMessage());
        }
    }

    private void withdraw(Account account){

        double withdrawAmount = helperServices.readDouble("Enter withdraw amount: ");

        try {
            accountService.withdraw(account, withdrawAmount);
        } catch (InsufficientBalanceException |
                 InvalidAmountException |
                 AccountNotFoundException e) {

            System.out.println(e.getMessage());
        }
    }

    private void transfer(Account account){

        String destinationUsername = helperServices.readValidString(
                "Enter destination username: ",
                accountService::isUsernameExists,
                "Username not found"
        );

        double amount = helperServices.readDouble("Enter amount to transfer: ");

        try {
            accountService.transfer(account, destinationUsername, amount);
        } catch (AccountNotFoundException | InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

    }

}
