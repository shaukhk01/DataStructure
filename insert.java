class Insert
{
    public static void main(String[]args)
    {
        int[] arr=new int[7];
         arr[0] = 1;
         arr[1] = 2;
         arr[2] = 3;
         arr[3] = 5;
         arr[4] = 6;

        int len = arr.length;
        int index = 3;
        for(int i=len-1;i>=index;i--)
        {
            arr[i] = arr[i-1];//inserting
    }
    arr[index] = 4;
    arr[arr.length-1] = 7;//append
    for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
/*-----------------------------------------------------
 * delete index[2];
 *----------------------------------------------------
 */
    for(int i=2;i<arr.length-1;i++)
    {
        arr[i] = arr[i+1];
    }
System.out.println("===========================");    
    for(int i=0;i<arr.length-1;i++)
        System.out.println(arr[i]);

}
}
