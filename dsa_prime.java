import java.util.*;
public class dsa_prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        if( n == 0 || n==1 ){
            System.out.println("0 and 1 are not Prime Number");
        }
        boolean Isprime=true;
       for(int i=2;i<Math.sqrt(n);i++){
        if(n % i == 0){
            Isprime=false;
            break;
        }
         if (Isprime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
       }
    }
}
