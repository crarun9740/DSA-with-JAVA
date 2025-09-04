public class heapoftest {

     static  int arr[]=new int[50];
     static  int size=0;
    public static void insert(int val){
        size++;
        int index=size;
       
        arr[index]=val;

        while(index > 1){
            int parent=index/2;
            if(arr[parent] < arr[index]){
               int temp=arr[parent];
               arr[parent]=arr[index];
               arr[index]=temp;
            }
            else{
                return;
            }
        }
    }
    static void deletefromheap(){
        if(size==0){
            return;
        }
        arr[1]=arr[size];
        size--;
        int i=1;
        
        while(i < size){
            int leftindex=2*i;
            int rightindex=2*i+1;

            if(leftindex <= size && arr[i] < arr[leftindex]){
                int temp=arr[i];
                arr[i]=arr[leftindex];
                arr[leftindex]=temp;
            }
            else if(rightindex <= size && arr[i]< arr[rightindex]){
                int temp=arr[i];
                arr[i]=arr[rightindex];
                arr[rightindex]=temp;
            }
            else{
                return;
            }
        }

    }
    static void heapify(int arr[],int n,int i){
        int largest=arr[i];
        int left=2*i;
        int right=2*i+1;
        if(left < n && arr[largest] < arr[left]){
            largest=left;
        }

        if(right < n && arr[largest] < arr[right]){
            largest=right;
        }
        if(largest!=i){
            int temp=arr[largest];
            arr[largest]=arr[i];
            arr[i]=temp;

            heapify(arr, n, largest);
        }
    }
   
    static  void print(){
        for(int i=1;i<=size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        insert(60);
        insert(61);
        insert(62);
        insert(63);
        insert(64);
        insert(65);

        print();
        deletefromheap();
        print();
         
        int n=size;
        int a[6]={54,51,55,53,50};
        for(int i=n/2;i>0;i++){
            heapify(arr, n, i);
        }
    }
}
