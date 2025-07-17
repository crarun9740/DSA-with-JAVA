import java.util.Scanner;

public class dsa_fib {
    public static int fibanocci(int n){
        int a=0,b=1,c=0;
        for(int i=2;i<n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
   System.out.println( fibanocci(n));
   } 
}
