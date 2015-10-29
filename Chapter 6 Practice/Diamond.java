import java.util.Scanner;

public class Diamond
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer = scan.nextInt();
        
        for(int i=0;
            i<2*integer;
            i++)
        {
            if(i<integer+1)
            {
                
            }
            
            for(int a = 1;
                a<=integer-i;
                a++)
            {
                System.out.print(" ");
            }
            
            for(int b = 1;
                b<2*i;
                b++)
            {
                System.out.print("*");
            }
            
            System.out.println("");
        }
    }
}