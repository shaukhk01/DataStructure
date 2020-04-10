public class Triangular
{
    public static void printTri(int[][] tri)
    {
        int[][] lower=new int[4][4];
        for(int i=0;i<tri.length;i++)
        {
            for(int j=0;j<tri.length;j++)
            {
                System.out.print("  "+tri[i][j]+"  ");
            }
            System.out.println();
        }
        for(int k=0;k<5;k++)
            System.out.println();//FOR SPACE

        for(int t=0;t<tri.length;t++)
        {
            for(int p=0;p<=t;p++)
                System.out.print("  "+tri[t][p]+"  ");
            System.out.println();
        }
        for(int a=0;a<5;a++)
            System.out.println();//FOR SPACE

        for(int m=0;m<tri.length;m++)
        {
            for(int n=0;n<=m;n++)
            {
                lower[m][n]=tri[m][n];
               // System.out.print("  "+tri[m][n]+"  ");
            }
        //System.out.println();
        }
        for(int q=0;q<tri.length;q++)
        {
            for(int r=0;r<tri.length;r++)
            {
                System.out.print("  "+lower[q][r]+"  ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args)
    {
        int[][] tri={{10,20,30,40},{50,60,70,80},{90,95,98,99},{22,44,77,88}};
        printTri(tri);
    }
}

