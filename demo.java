public class demo {
    public static void Armstrong(int n){
        int sum=0;
        int result=0;
        while(n > 0){
            int ld=n%10;
            sum=ld*ld*ld;
            System.out.println(sum);
            n=n/10;
            result+=sum;

         System.out.println(ld);
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        int n=153;
        Armstrong(n);

    }
}
