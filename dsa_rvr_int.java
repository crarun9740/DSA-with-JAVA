import java.util.Scanner;

public class dsa_rvr_int{
    public static int reverse(int n){
        int original_num=n;
        int rever=0;

        boolean isNegative=false;
        if(n< 0 ){
            isNegative=true;
            n=-n;
        }

        while(n != 0){
            int ld=n%10;
            rever=rever*10+ld;
            n=n/10;
        }
        if(isNegative){
            rever=-rever;
        }
        System.out.println("Original integer : "+original_num);
        return rever;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the integer");
        int n=sc.nextInt();
        System.out.println("Reversed Integer : "+reverse(n));
    }
}