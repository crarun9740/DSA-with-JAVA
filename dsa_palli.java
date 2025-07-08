
import java.util.Scanner;

public class dsa_palli {
    public static void pallindrome(int num){
    int rvr=0;
    int original=num;
    while(num > 0){
        int lastdigit=num %10;
        rvr=rvr*10+lastdigit;
        num=num/10;
    }
    System.out.println(original);
    System.out.println(rvr);

    if(original==rvr){
        System.out.println("Pallindrome : true");
    }
    else{
        System.out.println("Pallindrome : false");
    }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        pallindrome(num);
    }
}
