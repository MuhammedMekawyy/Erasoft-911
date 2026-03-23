package ProblemM;

public class LuckyNumbers {

    public void getLucky(int number1 , int number2) {
        boolean found = false;
        for (int i = number1; i <= number2; i++)
        {
            String currentNumber = String.valueOf(i);
            boolean isLucky = true;
            for(int j = 0 ; j<currentNumber.length() ; j++)
            {
                if(currentNumber.charAt(j)!='4' && currentNumber.charAt(j)!='7')
                {
                    isLucky=false;
                    break;
                }
            }
            if(isLucky)
            {
                found=true;
                System.out.print(i+" ");
            }
        }
        if (found==false) {
            System.out.println("-1");
        }
    }
}
