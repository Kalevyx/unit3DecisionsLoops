import java.util.Scanner;

public class RewriteLoops
{
    public static void R615()
    {
        int s = 0;
        int i = 1;
        
        while(i <= 10)
        {
            s+=i;
            i++;
        }
        
        System.out.println(s);
    }
    
    public static void R616()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scan.nextInt();
        
        double x = 0;
        double s = 1;
        
        while(s>.01)
        {
            s = 1.0/(1+n*n);
            n++;
            x+=s;
        }
        
        System.out.println(x);
    }
}