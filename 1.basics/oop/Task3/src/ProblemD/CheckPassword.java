package ProblemD;

public class CheckPassword {
    public int password=1999 ;

    public boolean check(int password) {
        if(password==this.password )
        {
            System.out.println("Correct");
            return true ;
        }
        else
        {
            System.out.println("Wrong");
            return false;
        }
    }
}
