public class changeCase
{
    public static void main(String[]args)
    {
        //String str="HELLO ANNIE";
          String str="hello ANNIE";
        char[] ch=str.toCharArray();//change string into array
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]>=65 && ch[i]<=90)
            {
               ch[i]+=(char)32;/*32 is constant code if we add 32 all given character ascii
                                *then we can get corresponding result
                               */
            }
            else if(ch[i]>=97 && ch[i]<=122)
                ch[i]-=(char)32;

            System.out.print(ch[i]);
        }
    }
}

