import java.util.Scanner;

public class FindMaxAndMin
{
    public static double findMax()
    {
        Scanner scan = new Scanner(System.in);
<<<<<<< HEAD
        System.out.println("Enter a series of numbers or any character to quit");
=======
        System.out.println("Enter a series of number or any character to quit");
>>>>>>> origin/master
        
        double largest = scan.nextDouble();
        while(scan.hasNextDouble())
        {
            double input = scan.nextDouble();
            if(input>largest)
            {
                largest=input;
            }
        }
        
        return largest;
    }
    
    public static double findMin()
    {
        Scanner scan = new Scanner(System.in);
<<<<<<< HEAD
        System.out.println("Enter a series of numbers or any character to quit");
            
=======
        System.out.println("Enter a series of number or any character to quit");
        
>>>>>>> origin/master
        double smallest = scan.nextDouble();
        while(scan.hasNextDouble())
        {
            double input = scan.nextDouble();
            if(input<smallest)
            {
                smallest=input;
            }
        }
<<<<<<< HEAD
           
=======
        
>>>>>>> origin/master
        return smallest;
    }
}