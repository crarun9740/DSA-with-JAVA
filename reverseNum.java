import java.util.Scanner;

public class reverseNum {
    static int reverse(int n){
        int ld=0;
        for(int i=0;i<=n+1;i++){
            int ans=n%10;
            n=n/10;
            if(n < 0){
                return -(ld*10+ans);
            }
           else{
            ld=ld*10+ans;
           }
        }
        return ld;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(reverse(n));

        
    }
}
