import java.util.Scanner;

public class Reccursiv_Fact {
    static int  Factorial(int n){
        if(n==0) return 1; 


      return n*Factorial(n-1);

        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n=sc.nextInt();
        
        System.out.println(Factorial(n));

    }
}
