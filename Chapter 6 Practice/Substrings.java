import java.util.Scanner;

public class Substrings
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scan.next();
        
        /*int length = word.length();
        
        for ( int i = 0;
            i < length;
            i ++)
        {
            System.out.println(word.charAt(i));
        }
        
        for ( int i = 0;
            i < length;
            i ++)
        {
            if ( i != length - 1)
            {
                System.out.println(word.substring(i));
                         
            }
        }
    
        for ( int i = 0;
            i < length;
            i ++)  
        {
            if ( i < length - 1&& i != 0)
            {
                System.out.println(word.substring(0, length - i));
            }
        }*/        
        
        for(int length=1;
            length<=word.length();
            length++)
        {
            for(int pos = 0;
                pos<=word.length()-length;
                pos++)
            {
                System.out.println(word.substring(pos,pos+length));
            }
        }
    }
}