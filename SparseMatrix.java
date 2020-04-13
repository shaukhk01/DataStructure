public class SparseMatrix
{
    public static int size=0;
    public static void printSparse(int mat[][],int sparse[][])
    {
        int k=0;
        for(int r=0;r<8;r++)
        {
            for(int c=0;c<9;c++)
            {
                if(mat[r][c] !=0)
                {
                    sparse[0][k]=r;
                    sparse[1][k]=c;
                    sparse[2][k]=mat[r][c];
                    k++;
                }
            }
        }
        for(int row=0;row<3;row++)
        {
            for(int col=0;col<size;col++)
            {
                System.out.print("  "+sparse[row][col]+"  ");
            }
        System.out.println();
       }
    }
    public static void calNonZeroElement(int mat[][])
    {
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(mat[i][j] !=0)
                    size++;
            }
        }
        int[][] spmatrix=new int[3][size];
        printSparse(mat,spmatrix);

    }
    public static void main(String[]args)
    {
        int[][] matrix={{0,0,0,0,0,0,0,3,0},
                        {0,0,8,0,0,10,0,0,0},
                        {0,0,0,0,0,0,0,0,0},
                        {4,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0},
                        {0,0,2,0,0,0,0,0,0},
                        {0,0,0,6,0,0,0,0,0},
                        {0,9,0,0,5,0,0,0,0},
                       };
        calNonZeroElement(matrix);
    }
}
