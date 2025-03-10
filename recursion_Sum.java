import java.util.Scanner;

public class recursion_Sum {
    static int sum(int n){
        if(n>=0 && n<=9){
            return n;
        }
        int ans=n%10;
      
       return  sum(n/10)+ans;
       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n value");
        int n=sc.nextInt();
        System.out.println(sum(n));
    }
}
