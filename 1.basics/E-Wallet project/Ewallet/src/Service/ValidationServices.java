package Service;

import model.Account;

/**
 * ValidationServices defines all validation rules used across the system.
 *
 * This interface is responsible for checking the correctness of user input
 * and business data before any operation is performed.
 *
 * It helps:
 * - Prevent invalid data from entering the system
 * - Centralize validation logic (clean architecture)
 * - Improve code reusability and maintainability
 */
public interface ValidationServices {

    /**
     * Validates whether the provided age is acceptable.
     *
     * @param age The age value to validate
     * @return true if age is valid, false otherwise
     *
     * Expected validation rules (example):
     * - Age must be positive
     * - Age must be within a realistic range (e.g., 18–100)
     *
     * Note:
     * - Using float allows decimal input, but typically age should be integer.
     *   Consider using int instead for stricter validation.
     */
    boolean isAgeValid(float age);

    /**
     * Validates whether the password meets security requirements.
     *
     * @param password The password string to validate
     * @return true if password is valid, false otherwise
     *
     * Expected validation rules (example):
     * - Minimum length (e.g., >= 8 characters)
     * - Contains uppercase, lowercase, digits, or special characters
     * - Must not be null or empty
     *
     * Note:
     * - This method only validates format, not encryption or storage security.
     */
    boolean isPasswordValid(String password);

    /**
     * Validates whether the username meets system requirements.
     *
     * @param username The username string to validate
     * @return true if username is valid, false otherwise
     *
     * Expected validation rules (example):
     * - Must not be null or empty
     * - Must have a minimum length
     * - May restrict special characters or spaces
     *
     * Note:
     * - This does NOT check if username already exists.
     *   That responsibility belongs to AccountService.
     */
    boolean isUsernameValid(String username);

    /**
     * Validates whether the phone number is in a correct format.
     *
     * @param PhoneNumber The phone number string to validate
     * @return true if phone number is valid, false otherwise
     *
     * Expected validation rules (example for Egyptian numbers):
     * - Must contain only digits
     * - Must start with valid prefixes (e.g., 010, 011, 012, 015)
     * - Must be of correct length (e.g., 11 digits)
     *
     * Example:
     * "01012345678" → valid
     * "12345abc" → invalid
     */
    boolean isPhoneNumberValid(String PhoneNumber);

    /**
     * Validates a complete Account object.
     *
     * @param account The account to validate
     *
     * Expected behavior:
     * - Check that account is not null
     * - Validate all fields (username, password, age, phone number, etc.)
     * - May throw exceptions if validation fails
     *
     * Example checks:
     * - isUsernameValid(account.getUsername())
     * - isPasswordValid(account.getPassword())
     *
     * Note:
     * - This method is usually called before creating or updating an account.
     */
    void validateAccount(Account account);

    /**
     * Validates a monetary amount used in operations like deposit, withdraw, or transfer.
     *
     * @param amount The amount to validate
     *
     * Expected behavior:
     * - Amount must be greater than zero
     * - May enforce upper limits (optional)
     * - May throw exception if invalid
     *
     * Example:
     * 100 → valid
     * 0 or negative → invalid
     */
    void validateAmount(double amount);

}