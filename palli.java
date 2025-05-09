import java.util.Scanner;

public class palli{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digits");
        int n=sc.nextInt();
        int reverse=0;
        int original=n;
        while(n>0){
            int ld=n%10;
            reverse=reverse*10+ld;
            n=n/10;
            
        }
        System.out.println(reverse);
        if(reverse==original){
            System.out.println("Pallindeom : True");
        }
        else{
            System.out.println("Pallindrome: False");
        }
    }

}