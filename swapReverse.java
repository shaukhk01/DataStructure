public class swapReverse
{
    public static char[] reverseswap(String str,int len)
    {
        char[] c= str.toCharArray();
        int j;
        char temp;
        for(j=0;j<len;j++)
        {
        }
        j=j-1;
        for(int i=0;i<j;i++,j--)
        {
            temp = c[i];
            c[i] = c[j];
            c[j] = temp;
        }
        return c;
    }
    public static void main(String[]args)
    {
       // String str="Python";
       String str = "Hello world";
        int len = str.length();
        System.out.println(reverseswap(str,len));

    }
}

