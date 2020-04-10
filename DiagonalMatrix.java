class Diagonal 
{
    public static boolean isDiagonalMatrix(int mat[][],int len)
    {
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)

                if((i !=j)&& (mat[i][j]!=0))
                {//System.out.println(" false");//verification for how many times
                   return false;              //return execute false stmnt
               }   //only one first false will be return other Not exit program
        }
        return true;//if condition for loop condition return statement not will execute
    }               //then it will be execute.
    public static void main(String args[])
    {
        int mat[][] = {{4,0,0,0},{0,7,0,0},{0,0,5,0},{0,0,0,1} };
        int len = mat.length;
        if(isDiagonalMatrix(mat,len))
            System.out.println("true");
        else
            System.out.println("No");
    }
}
