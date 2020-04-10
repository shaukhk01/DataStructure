class FindDiagonal
{
    public static boolean printD(int arr[][],int len)
    {
        int[][] diagonal=new int[4][4];
        for(int i=0;i<len;i++)

            for(int j=0;j<len;j++)

                if((i==j) && (arr[i][j] !=0))

                diagonal[i][j]=arr[i][j];

        for(int k=0;k<diagonal.length;k++)
            for(int n=0;n<diagonal.length;n++)
            System.out.println(diagonal[k][n]);
    

        return true;

    }
    public static void main(String[]args)
    {
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int len=arr.length;

        if (printD(arr,len))

           System.out.println("True");

        else
            System.out.println("False");

    }

}

