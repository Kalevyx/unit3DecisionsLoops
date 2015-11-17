import java.util.Scanner;

public class SumOfValues
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer greater than 2: ");
        int value = scan.nextInt();
        int sumOfValues = 0;
        if(value<2)
        {
            System.out.print("Enter an integer greater than 2: ");
        }
        else
        {
            for(int i = 0;
                i<=value;
                i+=2)
            {
                sumOfValues+=i;
            }
            System.out.println("The sum is "+sumOfValues);
        }
    }
}