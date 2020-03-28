public class lengthArray
{
    public static void main(String[]args)
    {

        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(arr.length);
        int count=0;
        for(int i:arr)
            count++;
        System.out.println("length: "+count);
    }

}
