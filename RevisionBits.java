public class RevisionBits {
    public static void SingleBits(int arr[]){
       int x=0;
       for(int i=0;i<arr.length;i++){
        x=x^arr[i];
       }
       System.out.println(x);
    }
    public static void Reverseb(int n){
        int result=0;
        for(int i=0;i<32;i++){
            result<<=1;
            result|=(n&1);
            n >>= 1;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        int arr[]={2,1,4,4,2};
        int n=;12
        SingleBits(arr);
        Reverseb(n);
    }
}
