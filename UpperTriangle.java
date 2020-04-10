public class UpperTriangle
{
    public static void printUpperTri(int[][] tri,int len)
    {
        
        int[][] upper=new int[4][4];
        for(int p=0;p<len;p++)
        {
            for(int q=0;q<len;q++)
            {
                System.out.print("  "+tri[p][q]+"  ");
            }
            System.out.println();
        }
        for(int r=0;r<4;r++)
            System.out.println();


        for(int i=0;i<len;i++)
        {
            for(int j=i;j<len;j++)
            {
               // System.out.print("  "+tri[i][j]+"  ");

                upper[i][j]=tri[i][j];
            }
        System.out.println();

     }
     for(int a=0;a<upper.length;a++)
     {
         for(int b=0;b<upper.length;b++)
         {
             System.out.print("  "+upper[a][b]+"  ");
         }
     System.out.println();
    }


    }
    public static void main(String[]args)
    {
        int[][] Tri={{10,20,30,40},{50,60,70,80},{90,50,10,20},{30,40,80,90}};
        printUpperTri(Tri,Tri.length);
    }
}
