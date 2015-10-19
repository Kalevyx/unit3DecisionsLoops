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

       double minXCenter;
       double minYCenter;
       
       xcenter1 < xcenter2 ? minXCenter = xcenter1 : minXCenter = xcenter2;
       
       
       
       // Your work goes here
       if(radius1+radius2<40)
       {
           System.out.println("Disjoint");
       }
       else if((radius1+xcenter1>=radius2+xcenter2)||(radius1+ycenter1>=radius2+ycenter2))
       {
            System.out.println("Mutually contained");
       }
       else if(radius1+radius2==40)
       {
           System.out.println("Tangent");
       }
       else
       {
           System.out.println("Overlapping");
       }
    }
}