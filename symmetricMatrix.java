public class symmetricMatrix
{
    public static void printTri(int[][] mat,int[][] sym,int len)
    {

        for(int s=0;s<3;s++)
            System.out.println();

            for(int i=0;i<len;i++)
            {
                for(int j=0;j<len;j++)
                    sym[i][j]=mat[j][i];//transpose
            }
            for(int q=0;q<len;q++)
            {
                for(int r=0;r<len;r++)
                {
                    System.out.print("  "+sym[q][r]+"  ");
                }
            System.out.println();
    }
    }


    public static boolean isSymmetric(int mat[][],int len)
    {
        int[][] sym=new int[3][3];//this array will passed as arg to printTri method

    for(int o=0;o<len;o++)
    {
        for(int p=0;p<len;p++)
        {
            System.out.print("  "+mat[o][p]+"  ");
        }
        System.out.println();
    }

        printTri(mat,sym,len);//calling method

    for(int t=0;t<len;t++)
        for(int f=0;f<len;f++)
            if(mat[t][f] !=sym[t][f])//comparing two arrays
                return false;//not symmetric immediately return false and exit program
    return true;//not return always execute its statement
    }

    public static void main(String[]args)
    {
        int[][] tri={{3,5,8},{3,4,7},{8,5,3}};
//        int[][] tri={{1,3,5},{3,2,4},{5,4,1}};
        int len=tri.length;

        if(isSymmetric(tri,len))
            System.out.println("isSymmetric: True");
        else
            System.out.println("isSymmetric: False");
    }
}

