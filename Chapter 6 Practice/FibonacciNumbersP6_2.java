import java.util.Scanner;

public class FibonacciNumbersP6_2
{
    public static void main(String[]args)
    {
        int f1=1;
        int f2=1;
        int fnew=1;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer = scan.nextInt();
        
        boolean change = true;
        
        for(int i = 2;
            i < integer;
            i++)
        {
            if(change==true)
            {
                fnew = f1 + f2;
                f1 = fnew;
                change = false;
            }
            
            else
            {
                fnew = f1 + f2;
                f2 = fnew;
                change = true;
            }
        }
        
        System.out.println(fnew);
    }
}