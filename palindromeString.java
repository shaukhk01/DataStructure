/*Given string task is to find wheter the string 
 * is a palindrome or not in java without using..
 * llibrary method.
 ************************************************/
public class palindromeString
{
    public static boolean isPalindrome(String str)
    {
        int i=0,j=str.length()-1;
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j))//charAt() method used for return char value 
                return false;               //at the give index number.
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args)
    {
        String str="121";
        if(isPalindrome(str))
            System.out.println("True");
        else
            System.out.println("No");
    }
}

