public class FindFirstMatch
{
    //returns index of first space in specified string or -1 if string contains no spaces
    
    public static int findFirstSpace(String str)
    {
        boolean found = false;
        int position = 0;
        
        while(!found&&position<str.length())
        {
            char ch = str.charAt(position);
            
            if(ch==' ')
            {
                found = true;
            }
            else
            {
                position++;
            }
        }
        if (!found)
        {
            position = -1;
        }
        
        return position;
    }
}