import java.util.Random;

public class MontyHall
{
    public static void main(String[]args)
    {
        Random generator = new Random();
        
        int count = 0;
        int rightDoor;
        int door;
        int hostDoor;
        
        for(int i=0;
            i<1000;
            i++)
        {
            door = generator.nextInt(4)+1;
            rightDoor = generator.nextInt(4)+1;
            hostDoor = generator.nextInt(4)+1;
            
            while(hostDoor==door&&hostDoor!=rightDoor)
            {
                hostDoor = generator.nextInt(4)+1;
            }
            
            if(hostDoor!=2&&hostDoor!=3)
            {
                door=1;
            }
            else if(hostDoor!=1&&hostDoor!=3)
            {
                door=2;
            }
            else
            {
                door=3;
            }
            
            if(door==rightDoor)
            {
                count+=1
            }
        }
    }
}