class heapInsert{

    static void insertHeap(int[]a,int n){
        int temp,i=n;
        temp = a[i];

        while(i>1 && temp>a[i/2]){
            a[i] = a[i/2];
            i=i/2;
        }
        a[i]=temp;
    }

    static void heapDelete(int[]arr,int n){
        
        int x,i,j,temp,value;
        value = arr[1];
        x = arr[n];
        arr[1]=arr[n];
        arr[n] = value;

        i=1;
        j=2*i;
        while(j<n-1){

            if(arr[j+1]>arr[j])
                j=j+1;
            if(arr[i]<arr[j]){

                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i=j;
                j=2*j;
            }
            else
                break;
        }
    }
    public static void main(String[]args){

        heapInsert h = new heapInsert();
//        int[]arr = {0,40,30,15,20,10,12,6,5,50};
    //    int[] arr = {0,40,35,15,30,10,12,6,5,20,50};

        int H[] = {0,10,20,30,25,5,40,35};

        for(int i=2;i<H.length;i++)
            insertHeap(H,i);
        heapDelete(H,7);
        heapDelete(H,6);

        for(int i=1;i<H.length;i++)
            System.out.print(H[i]+" ");
        System.out.println();
    }
}
