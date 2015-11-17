public class MultiplicationTable
{
    public static void main(String[]args)
    {
        for(int row=1;
            row<=12;
            row++)
        {
            for(int column=1;
                column<=12;
                column++)
            {
                System.out.print((row*column)+"\t");
            }
            System.out.println();
        }
    }
}