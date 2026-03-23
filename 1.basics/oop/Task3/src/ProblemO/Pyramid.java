package ProblemO;

public class Pyramid {
    public void print ( int outerCount) {
        for(int i=0 ; i<outerCount ; i++)
        {
            for(int j=0 ; j<=i ; j++)
            {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
