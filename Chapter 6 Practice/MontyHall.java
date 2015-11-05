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
            door = generator.nextInt(3)+1;
            rightDoor = generator.nextInt(3)+1;
            hostDoor = generator.nextInt(3)+1;
            
            while(hostDoor==door&&hostDoor!=rightDoor)
            {
                hostDoor = generator.nextInt(3)+1;
            }
            
            int originalDoor=door;
            
            while(door!=hostDoor&&door!=originalDoor)
            {
                door=generator.nextInt(3)+1;
            }
            
            if(door!=rightDoor)
            {
                count+=1;
            }
        }
        
        System.out.println(count);
    }
}