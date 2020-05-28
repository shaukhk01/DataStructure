class SelectionSort{

    public static void selection(int[]a,int n){

        int j,k,temp;
        for(int i=0;i<n;i++){

            for(j=k=i;j<n;j++){

                if(a[j]<a[k])
                    k=j;
            }

            temp = a[k];
            a[k] = a[i]; 
            a[i] = temp;
    }
    }

    public static void main(String[]args){

//        int[]A={11,13,7,2,6,9,4,5,10,3};
          int[]A={11,13,7,12,16,9,24,5,10,3};
        int size = A.length;

        selection(A,size);

        for(int i=0;i<A.length;i++)
            System.out.print(A[i]+" ");
        System.out.println();
    }
}
