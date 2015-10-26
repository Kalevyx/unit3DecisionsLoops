import java.util.Scanner;

public class LeapYear
{
    public static boolean isLeapYear(int year)
    {
        return ((year%4==0&&year%100!=0)||year%400==0);
    }
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = s.nextInt();
        
        if(LeapYear.isLeapYear(year))
        {
            System.out.println("It is a leap year");
        }
        else
        {
            System.out.println("It is not a leap year");
        }
    }
}