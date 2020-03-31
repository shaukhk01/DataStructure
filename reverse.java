class ReverseString
{
    public static String reverse(String str,char c2[])
    {
        char[] c=str.toCharArray();//convert string into array
        int len = c.length-1;
        for(int i=0;i<=len;i++)
        {
            for(int j=i;j<=i;j++)
            {
             c2[j]=c[len-i];
            }
        }
        String s=new String(c2);//converting array into string
        return s;
    }
    public static void main(String[]args)
    {
       // String str="Python";
       String str="Hello world";
        int len = str.length();
        char[] c2=new char[len];//here we can not using len-1 because of storing value size-1
       System.out.println(reverse(str,c2));
    }
}

