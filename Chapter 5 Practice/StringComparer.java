

public class StringComparer
{
    public static void main(String[] args)
    {
        String word1 = "catalog";
        String word2 = "cat";
        
        if (word1.compareTo("aaa") > 0)
        {
            System.out.println("Condition 1: True");
        }
        else
        {
            System.out.println("Condition 1: False");
        }
        
        if (word1.equals(word2))
        {
            System.out.println("Condition 2: True");
        }
        else
        {
            System.out.println("Condition 2: False");
        }
        
        if (word1.compareTo(word2) < 0)
        {
            System.out.println("Condition 3: True");
        }
        else
        {
            System.out.println("Condition 3: False");
        }
        
        String word1Pref = word1.substring(0,3);
        String word2Pref = word2.substring(0,3);
        
        if (word1Pref.equals(word2Pref))
        {
            System.out.println("Condition 4: True");
        }
        else
        {
            System.out.println("Condition 4: False");
        }
    }
}