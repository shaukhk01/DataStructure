//FindDuplicate Element in Given String.

public class FindDuplicate
{
    public static void printduplicate(String str)
    {
        int len=str.length();
        char[] H=new char[26];

        for(int i=0;i<len;i++)
        {
            H[str.charAt(i)-97]+=1;
        }
        for(int j=0;j<H.length;j++)
        {
            if(H[j]>1)
            {
                 int i=j+97;
                 char c=(char)i;
                System.out.println(c);
            }
    }
    }
    public static void main(String[]args)
    {
        String str="findingd";
        printduplicate(str);
    }
}

