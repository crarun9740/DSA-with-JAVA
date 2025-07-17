import java.util.Scanner;

public class prime {
    public static void  check_Prime(int n){
         boolean Isprime=true;
        if(n==0 || n==1){
            System.out.println("Not a prime number");
            for(int i=2;i<Math.sqrt(n);i++){
                if(n % i== 0){
                    Isprime=false;
                    break;
                }
            }
        }
         if(Isprime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
    }
}
