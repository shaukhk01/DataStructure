public class PairOfElement
{
    public static void printSum(int arr[],int len)
    {
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(arr[i]+arr[j]==10)
                    System.out.println(arr[i]+" + "+arr[j]);

    }
        }
    }
    //using HashTable method
    public static void printHash(int arr2[],int Hash[],int l2,int k)
    {
        for(int m=0;m<l2;m++)
        {
            Hash[arr2[m]]=1;
        }
        for(int n=0;n<l2;n++)
        {
            if(k>arr2[n])
            {
                if(Hash[k-arr2[n]]!=0)
            {
//                System.out.print(arr2[n]+" ");
            }
    }
    }
    }
    public static void printSortedArray(int arr3[],int len3)
    {
        int c=10;
        int q=len3-1;
        for(int x=0;x<len3;x++)
        {
            for(int z=q;z>0;z--)
            {
                if(arr3[x]+arr3[z]==c)
                {
                    System.out.println(arr3[x]+"+"+arr3[z]);
                      
                }
            }
        }
    }
    public static void main(String[]args)
    {
        int[] arr={6,3,8,10,16,7,5,2,9,14};
        int len=arr.length;
        printSum(arr,len);
        int[] arr2={6,3,8,10,16,7,4,2,9,14};//unsorted array
        int[] Hash=new int[16+1];
        int l2=arr2.length;
        int k=10;
        printHash(arr2,Hash,l2,k);
        int[] arr3={1,3,4,5,6,8,9,10,12,14};//sortedArray
        int l3 = arr3.length;
        printSortedArray(arr3,l3);
    }
}
