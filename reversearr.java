
import java.util.Scanner;

public class reversearr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int n=arr.length;
        System.out.println("Reversed array elements are");
       for(int i=n-1;i>=0;i--){
        System.out.print(" "+arr[i]);
       }

    }
}
