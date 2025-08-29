
import java.util.Scanner;

public class matrices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        System.out.println("Enter m");
        int m=sc.nextInt();
        int arr1[][]=new int[m][n];
        System.out.println("Enter the marix input");
       
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix are : ");
         for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                System.out.print(arr1[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
