public class ProductArr {
    static int[] product(int arr[]){
        int[] leftsum=new int[arr.length];
        int[] rightsum=new int[arr.length];
        leftsum[0]=1;
        for(int i=1;i<arr.length;i++){
            leftsum[i]=leftsum[i-1]*arr[i-1];
        }
        rightsum[arr.length-1]=1;
        for(int i=arr.length-2;i>-1;i--){
            rightsum[i]=rightsum[i+1]*arr[i+1];
        }

        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=leftsum[i]*rightsum[i];
        }
        return ans; 
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int ans[]=product(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
