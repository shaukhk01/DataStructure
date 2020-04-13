public class sparsematrix
{
    public static int size=0;
    public static void sparse(int mat[][],int spar[][])
    {
        int k=0;
        for(int r=0;r<4;r++)
        {
            for(int c=0;c<5;c++)
            {
                if(mat[r][c] !=0)
                {
                    spar[0][k]=r;//row index stored
                    spar[1][k]=c;//column index stored
                    spar[2][k]=mat[r][c];//row and col index stored acutal value into new array.
                    k++;
                }
            }
        }
        for(int t=0;t<3;t++)//3-->is length of row spar[][]
        {
            for(int col=0;col<size;col++)//size -->length of col spar[][]
            {
                System.out.print("  "+spar[t][col]+"  ");
            }
        System.out.println();
        }

    }
    public static void matrix(int mat[][])
    {
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(mat[i][j] !=0)
                    size++;
            }
        }
        int[][] spar=new int[3][size];/*3-->Because we need only each element of Row
                                       * -->each element of Column and Their Value
                                       *  so Total things are 3 therefor we take 3 block
                                       *  and each block size corresponding to non-zero element.
                                       *  i.e [3][size eqaul to no of non-zero element]
                                       */
        sparse(mat,spar);
    }

    public static void main(String[]args)
    {
        int[][] sparse={{0,0,3,0,4},
                        {0,0,5,7,0},
                        {0,0,0,0,0},
                        {0,2,6,0,0},
                       };
        matrix(sparse);
    }
}
