class Merge{

    static void mergeSort(int[]A,int[]B,int m,int n){

        int i,j,k;
        i=j=k=0;
        int[]C=new int[10];

        while(i<m && j<n){

            if(A[i]<B[j]){
                C[k++]=A[i++];
                
            }
            else
                C[k++]=B[j++];
            }

        for(;i<m; i++)
            C[k++]=A[i++];
        for(;j<m;j++)
            C[k++]=B[j++];

        for(int p=0;p<C.length;p++)
            System.out.print(C[p]+" ");
        System.out.println();
    }
    public static void main(String[]args){

        int[]A={2,10,18,20,23};
        int[]B={4,9,19,25};
        int m=A.length;
        int n=B.length;
        mergeSort(A,B,m,n);
    }
}
