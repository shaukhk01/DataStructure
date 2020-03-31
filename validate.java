public class validate
{
    public static char valid(char arr[])
    {
        int len=arr.length;
        for(int i=0;i<len;i++)
        {
            if(!(arr[i]>=65 && arr[i]<=90) && !(arr[i]>=97 && arr[i]<=122)&& !(arr[i]>=48 && arr[i]<=57))
            {
                return '0';
            }
    }
    return '1';
    
    }

    public static void main(String[]args)
    {
        char[] arr={'A','n','K',1};
        if(valid(arr)=='1')
            System.out.println("valid string");
        else
            System.out.println("invalid string");
    }
}

