class Heap{

    public static  void heapInsert(int[]arr,int n){

        int temp,i=n;
        temp =arr[i]; 

        while(i>1 && temp>arr[i/2]){

            arr[i] = arr[i/2];
            i = i/2;
        }

        arr[i] =temp;
    }

    public static void main(String[]args){

        Heap h = new Heap();
        int[] array = {0,40,35,15,30,10,12,6,5,20,50,45};
//        int[] array = {0,10,20,30,25,5,40,35};

        int x;
        for(x=2;x<array.length;x++)//here x=2 because we are taking value[0]and[1] having a max-head i.e start from [2]
            heapInsert(array,x);

        for(int k=1;k<array.length;k++)
            System.out.print(array[k]+" ");

        System.out.println();
    }
}
