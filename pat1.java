import java.util.*;

public class pat1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the a value:");
        int a=sc.nextInt();
        // for(int i=0;i<a;i++){
        //     for(int j=0;j<a;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i=1;i<=a;i++){
        //     for(int j=1;j<=a-i+1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        for(int i=1;i<=a;i++){
            for(int j=1;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
