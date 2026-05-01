package Service;

import model.Account;

/**
 * AccountService defines all business operations related to Account management.
 *
 * This interface acts as a contract between the service layer and other layers
 * (such as controllers or UI), ensuring consistent behavior across implementations.
 */
public interface AccountService {

    /**
     * Creates a new account in the system.
     *
     * @param account The Account object containing user details (username, password, etc.)
     * @return true if the account was successfully created,
     *         false if creation failed (e.g., username already exists)
     */
    boolean createAccount(Account account);

    /**
     * Checks if an account exists in the system.
     *
     * @param account The account object (usually contains username and/or password)
     * @return The existing Account object if found,
     *         null if no matching account exists
     *
     * Note: This method name is a bit misleading — it returns an Account, not boolean.
     * A better name would be: findAccount() or getAccount()
     */
    Account isAccountExist(Account account);

    /**
     * Deletes an existing account from the system.
     *
     * @param account The account to be deleted
     *
     * Expected behavior:
     * - Should validate that the account exists before deletion
     * - May throw an exception if account does not exist
     */
    void deleteAccount(Account account);

    /**
     * Changes the password of an existing account.
     *
     * @param account The account whose password will be changed
     * @param newPassword The new password to be set
     * @param oldPassword The current password (used for verification)
     *
     * Expected behavior:
     * - Validate that the old password is correct
     * - Validate new password format (length, strength, etc.)
     * - Update password only if validation succeeds
     * - May throw exception if validation fails
     */
    void changeExistPassword(Account account, String newPassword, String oldPassword);

    /**
     * Deposits a specific amount into the account balance.
     *
     * @param account The account to deposit into
     * @param depositAmount The amount to be added
     *
     * Expected behavior:
     * - Amount must be positive
     * - Account must exist
     * - Balance increases by depositAmount
     * - May throw exception for invalid input
     */
    void deposit(Account account, double depositAmount);

    /**
     * Withdraws a specific amount from the account balance.
     *
     * @param account The account to withdraw from
     * @param withdrawAmount The amount to be deducted
     *
     * Expected behavior:
     * - Amount must be positive
     * - Account must exist
     * - Account must have sufficient balance
     * - Balance decreases by withdrawAmount
     * - May throw exception if insufficient funds
     */
    void withdraw(Account account, double withdrawAmount);

    /**
     * Checks whether a username already exists in the system.
     *
     * @param destinationUsername The username to check
     * @return true if username exists,
     *         false otherwise
     *
     * Common use:
     * - Validation before account creation
     * - Validation before transfer operations
     */
    boolean isUsernameExists(String destinationUsername);

    /**
     * Transfers money from one account to another.
     *
     * @param account The source account (sender)
     * @param destinationUsername The username of the receiver
     * @param amount The amount to transfer
     *
     * Expected behavior:
     * - Validate source account exists
     * - Validate destination account exists
     * - Validate sufficient balance in source account
     * - Deduct amount from source account
     * - Add amount to destination account
     * - Operation should be atomic (either fully completed or not at all)
     * - May throw exceptions for invalid cases
     */
    void transfer(Account account, String destinationUsername, double amount);

}