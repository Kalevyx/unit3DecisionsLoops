public class NestedLoops
{
    public static void main(String[]args)
    {
        int num1 = 1;
        int num2 = 1;
        
        while(num1<3)
        {
            while(num2<5)
            {
                System.out.println(num1+" "+num2);
                num2++;
            }
            num1++;
            num2=1;
        }
    }
}