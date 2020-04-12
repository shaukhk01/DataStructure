public class ToeplitzExam
{
       public static  int len1=5;
       public static  int len2=5;
    public static boolean isDaigonal(int mat[][],int i,int j)
    {
        int result = mat[i][j];

        while(++i<len1 && ++j<len2)
        {
            if(mat[i][j] !=result)
                return false;
        }
        return true;
    }

    public static boolean isToeplitz(int mat[][])
    {
        //do each element in first row
        for(int p=0;p<len1;p++)
        {
         if(!isDaigonal(mat,0,p))//if return statment is true then it will not execute[[see.t2.java]]
                return false;
        }
        //do each element in a first  column
        for(int k=1;k<len2;k++)//k=1 because of first row all element is done.
        {
            if(!isDaigonal(mat,k,0))
                return false;
        }
        return true;
    }
    public static void main(String[]args)
    {
        int[][] mat={{2,3,4,5,6},
                     {7,2,3,4,5},
                     {8,7,2,3,4},
                     {9,8,7,2,3},
                     {10,9,0,7,2}
                     };
            if(isToeplitz(mat))
                System.out.println("True");
            else
                System.out.println("False");
    }
}
