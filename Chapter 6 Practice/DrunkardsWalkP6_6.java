import java.util.Random;

public class DrunkardsWalkP6_6
{
    public static void main(String[]args)
    {
        Random generator = new Random();
        int x = 0;
        int y = 0;
        int number;
        
        for(int i = 1;
            i<=100;
            i++)
        {
            number = generator.nextInt(4)+1;
            
            if(number==1)
            {
                x++;
            }
            
            else if(number==2)
            {
                x--;
            }
            
            else if(number==3)
            {
                y++;
            }
            
            else if(number==4)
            {
                y--;
            }
        }
        
        System.out.println("The drunkard is at ("+x+","+y+")");
    }
}