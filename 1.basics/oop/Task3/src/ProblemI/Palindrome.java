package ProblemI;

public class Palindrome {
    private String number ;

    public void pali (String number) {

        String res = "";

        for (int i = number.length() - 1; i >= 0; i--) {
            res = res + number.charAt(i);
        }
        int firstNumber = Integer.parseInt(number);
        int secondNumber = Integer.parseInt(res);
        if(firstNumber==secondNumber) {
            System.out.println(secondNumber);
            System.out.println("YES");
        }
        else {
            System.out.println(secondNumber);
            System.out.println("NO");
        }
    }
}
