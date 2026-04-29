package Service;


import java.util.function.Predicate;

public interface HelperServices {


     String readLine(String message);

     float readFloat(String message);

     int readInteger(String message);

     double readDouble(String message);

     void handleException();

     void resetExceptionCounter();

     String readValidString(String message, Predicate<String> validator, String errorMsg);

      String maskPassword(String password);

}
