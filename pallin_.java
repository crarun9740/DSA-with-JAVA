import java.util.Scanner;

public class pallin_ {
    public static boolean Pallindrome(int n){
        int original=n;
        int reverse=0;
        boolean flag=false;
        if(n<0){
            n=-n;
        }
        while(n>0){
            int ld=n%10;
            reverse=reverse*10+ld;
            n=n/10;
        }
        System.out.println("reversed integer:"+reverse);
        System.out.println("Original integer:"+original);
        if(original==reverse){
            flag=true;
        }
      
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the integer");
        int n=sc.nextInt();
        System.out.println(Pallindrome(n));
    }
}
