import java.util.Scanner;

public class Values
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input an integer greater than 2: ");
        int integer = scan.nextInt();
        if(integer>=2)
        {
            int num=integer/2;
            int x = 0;
            
            for(int i=0;
            i<num;
            i++)
            {
                x+=2;
                System.out.println(x);
            }
        }
        else
        {
            System.out.println("Integer must be greater than 2");
        }
    }
}