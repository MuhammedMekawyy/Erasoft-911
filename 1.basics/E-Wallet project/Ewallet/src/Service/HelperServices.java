package Service;

import java.util.function.Predicate;

/**
 * HelperServices provides utility methods for user input handling,
 * validation, and general helper operations.
 *
 * This interface is typically used by the presentation layer (CLI/UI)
 * to safely read and validate user input while handling errors gracefully.
 */
public interface HelperServices {

     /**
      * Reads a full line of text input from the user.
      *
      * @param message The prompt message displayed to the user
      * @return The entered string (may be empty but not null)
      *
      * Expected behavior:
      * - Displays the message to the user
      * - Reads input including spaces
      */
     String readLine(String message);

     /**
      * Reads a float value from the user.
      *
      * @param message The prompt message displayed to the user
      * @return The parsed float value
      *
      * Expected behavior:
      * - Keeps asking until a valid float is entered
      * - Handles invalid input (e.g., letters instead of numbers)
      */
     float readFloat(String message);

     /**
      * Reads an integer value from the user.
      *
      * @param message The prompt message displayed to the user
      * @return The parsed integer value
      *
      * Expected behavior:
      * - Keeps asking until a valid integer is entered
      * - Handles invalid input safely
      */
     int readInteger(String message);

     /**
      * Reads a double value from the user.
      *
      * @param message The prompt message displayed to the user
      * @return The parsed double value
      *
      * Expected behavior:
      * - Keeps prompting until valid numeric input is provided
      * - Useful for money-related inputs (e.g., balance, transfer)
      */
     double readDouble(String message);

     /**
      * Handles exceptions related to user input.
      *
      * Expected behavior:
      * - Displays user-friendly error messages
      * - May track number of invalid attempts
      * - Can be used to limit retries or log errors
      *
      * Note:
      * - Implementation may vary (logging, retry logic, etc.)
      */
     void handleException();

     /**
      * Resets the internal exception/error counter.
      *
      * Expected behavior:
      * - Called after successful input
      * - Ensures previous failed attempts don't affect future operations
      */
     void resetExceptionCounter();

     /**
      * Reads a string and validates it using a custom condition.
      *
      * @param message The prompt message displayed to the user
      * @param validator A Predicate function that checks if input is valid
      *                  (returns true if valid, false otherwise)
      * @param errorMsg Message displayed when validation fails
      *
      * @return A valid string that satisfies the validator condition
      *
      * Example:
      * readValidString("Enter username: ", this::isUsernameValid, "Invalid username")
      *
      * Expected behavior:
      * - Keeps asking until validator returns true
      * - Displays errorMsg on failure
      */
     String readValidString(String message, Predicate<String> validator, String errorMsg);

     /**
      * Masks a password for secure display.
      *
      * @param password The original password string
      * @return A masked version of the password (e.g., "******")
      *
      * Expected behavior:
      * - Does NOT reveal actual characters
      * - Length may match original password or be fixed
      *
      * Example:
      * input:  "mypassword123"
      * output: "*************"
      *
      * Note:
      * - Used for display purposes only (not encryption)
      */
     String maskPassword(String password);

}