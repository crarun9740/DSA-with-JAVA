import java.util.Scanner;

public class Numberofone {
    static int hamming(int n){
        int count=0;
       while( n > 0){
        if((n&1)==1){
            count++;
        }
           n>>=1;
       }
    
    return count;
    }
    public static void main(String[] args) {
        System.out.println("Enter the n : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(hamming(n));
    }
}
