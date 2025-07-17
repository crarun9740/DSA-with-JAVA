import java.util.Scanner;

public class dsa_gcd {
    public static int gcd(int a,int b){
        if(a == 0){
            return b;
        }
        if(b == 0){
            return a;
        }
        while(b !=0){
            int temp=b;
            b=a % b;
            a=temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the a : ");
        int a=sc.nextInt();
        System.out.println("Enter the b : ");
        int b=sc.nextInt();
       System.out.println("GCD value is :"+ gcd(a,b));
    }
}
