import java.util.Scanner;

public class CircleOverlap2
{
   public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);

       System.out.print("Input the radius of the first circle: ");
       double radius1 = in.nextDouble(); 
       System.out.print("Input the x-coordinate of the first circle: ");
       double xcenter1 = in.nextDouble();
       System.out.print("Input the y-coordinate of the first circle: ");
       double ycenter1 = in.nextDouble();
       System.out.print("Input the radius of the second circle: ");
       double radius2 = in.nextDouble(); 
       System.out.print("Input the x-coordinate of the second circle: ");
       double xcenter2 = in.nextDouble();
       System.out.print("Input the y-coordinate of the second circle: ");
       double ycenter2 = in.nextDouble();

       double distance = Math.pow((xcenter1-xcenter2)*(xcenter1-xcenter2)+(ycenter1-ycenter2)*(ycenter1-ycenter2),.5);
       
       // Your work goes here
       if (radius2 >= radius1 && distance <= (radius2 - radius1))
       {
               System.out.println("Circle 1 is inside Circle 2.");
       }
       else if (radius1 >= radius2 && distance <= (radius1 - radius2))
       {
               System.out.println("Circle 2 is inside Circle 1.");
       }
       else if (distance > (radius1 + radius2))
       {
           System.out.println("Circle 2 does not overlap Circle 1.");
       }
       else
       {
           System.out.println("Circle 2 overlaps Circle 1.");
       }
    }
}