class BubbleSort{

    static void bubbleSort(int[]S,int n){

        int temp=0;
        int flag=0;

        for(int i=0;i<n;i++){

            for(int j=0;j<n-1-i;j++){

                if(S[j]>S[j+1]){

                    temp = S[j];
                    S[j] = S[j+1];
                    S[j+1]   = temp;

                    flag=1;
                }
            }
            if(flag == 0){

                System.out.println("given array is sorted");
            break;
            }
        }
   }

    public static void main(String[]args){

       int[] arr={3,7,9,10,6,5,12,4,11,2};
//          int[] arr={8,5,7,3,2};
     //     int[] arr={1,2,3,4,5,6,7,8};adaptive
        int n=arr.length;
        bubbleSort(arr,n);

        for(int k=0;k<arr.length;k++)
            System.out.print(arr[k]+" ");
        System.out.println();
    }
}

      
