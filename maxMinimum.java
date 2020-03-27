public class maxMinimum
{
    public static void printmaxmin(int arr[],int len,int min,int max)
    {
        for(int i=1;i<len;i++)
        {
            if(arr[i]<min)
                min=arr[i];
            else if(arr[i]>max)
                max=arr[i];
        }
        System.out.println(max+"  "+min);
    }
    public static void main(String[]args)
    {
        int[] arr={5,8,3,9,6,6,2,10,7,-1,4};
        int len=arr.length;
        int min=arr[0];
        int max=arr[0];
        printmaxmin(arr,len,min,max);
    }
}


