package ProblemP;

public class Shape {
    public void print ( int outerCount) {
        for(int i=outerCount ; i>0 ; i--)
        {
            for(int j=0 ; j<i ; j++)
            {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
