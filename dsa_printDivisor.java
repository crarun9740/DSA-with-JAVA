import java.util.Scanner;

public class dsa_printDivisor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the NUmber");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            if(n % i ==0){
                System.out.print(i + " ");
            }
        }
    }
}
