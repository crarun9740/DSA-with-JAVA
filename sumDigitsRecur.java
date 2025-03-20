
import java.util.Scanner;

public class sumDigitsRecur {
    static int SumofDigit(int n){
        if(n >=0 && n <=9){
            return n;
        }
      int smallans=SumofDigit(n/10);
      int ans=smallans+n%10;
      return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of digits");
        int n=sc.nextInt();
        SumofDigit(n);
    }
}
