public class CountingBits {
    public static int[] count(int arr[]){
         int res[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int n=arr[i];
            int count=0;
            while(n > 0){
                count+=(n&1);
                n >>= 1;
            }
            res[i]=count;
        }
        return res;
    }
   public static void main(String[] args) {
    int arr[]={1,0,2,3};
    int ans[]=count(arr);
    for(int i=0;i<arr.length;i++){
        System.out.print(ans[i]+" ");
    }

   } 
}
