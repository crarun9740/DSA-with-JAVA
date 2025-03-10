import java.util.Scanner;

public class recursive {
    static int Fib_nocci(int n){
      if(n==0 || n==1) return n;

     
      return Fib_nocci(-1)+Fib_nocci(n-2);
      
    }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the n");
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
        System.out.println(Fib_nocci(i));
    }
   
    
   }
}
