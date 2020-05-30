class MergeSingleList{

    static void mergeSort(int[]A,int mid,int J,int h){

        int i,k,j;
        j=J;
        i=k=0;

        int[]B=new int[h];

        while(i<=mid && j<h){

            if(A[i]<A[j])
                B[k++]=A[i++];
            else
                B[k++]=A[j++];
      }
      for(;i<=mid;i++)
          B[k++]=A[mid];

      for(int p=0;p<B.length;p++)
          System.out.print(B[p]+" ");
   }


    public static void main(String[]args){

        int[]A={2,5,8,12,3,6,7,10};
        int mid=3;
        int j  = mid+1;
        int h  = A.length;

        mergeSort(A,mid,j,h);
        System.out.println();

    }
}
