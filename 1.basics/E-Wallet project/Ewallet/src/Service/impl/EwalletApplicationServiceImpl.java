package Service.impl;
import Service.AccountService;
import Service.EwalletApplicationService;
import Service.HelperServices;
import Service.ValidationServices;
import model.Account;


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


            String username = helperServices.readLine("Enter username: ");
            String password =  helperServices.readLine("Enter password: ");
            String phoneNumber = helperServices.readLine("Enter phone number: ");
            float age = helperServices.readFloat("Enter age: ");

            if (!validationServices.isAgeValid(age)) {
                System.out.println("Registration failed: You must be at least 18 years old.");
                 return;
        }

            while (true) {
            age = helperServices.readFloat("Enter age: ");

            if (validationServices.isAgeValid(age)) {
                break;
            } else {
                System.out.println("Invalid age. You must be at least 18 years old.");
            }
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
        String username = helperServices.readLine("Enter username: ");
        String password =  helperServices.readLine("Enter password: ");

        Account account=new Account(username,password);
        boolean isExist = accountService.isAccountExist(account);

        if(isExist){
            System.out.println("\nLogin successful!");
            mainProfile();
        }
        else
            System.out.println("\nInvalid username or password.");
    }

    private void mainProfile() {

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

        // Future: implement actual logic here
    }


}
