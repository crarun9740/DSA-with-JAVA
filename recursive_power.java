import java.util.Scanner;

public class recursive_power {
    static int power(int a,int b){
        if(b==0){
            return 1;
        }
        return power(a, b-1)*a;
       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the a and b value");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(power(a, b));
    }
}
