import java.util.Scanner;

public class dsa_Armstrong {
    public static boolean Arm_value(int n){
        int count=String.valueOf(n).length();
        int original_num=n;
        int sum=0;
        while( n !=0){
            int ld=n%10;
            sum+=Math.pow(ld, count);
            n=n/10;
        }
        return sum==original_num;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
       System.out.println(Arm_value(n));

    }
}
