public class indexofFirstoccur {
    public static int firstoccur(int arr[]){
        for(int i=0;i<arr.length-1;i++){
           for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
              return i;
            }
           }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={3,2,0,1,4,2,1};
        System.out.println(firstoccur(arr));

    }
}
