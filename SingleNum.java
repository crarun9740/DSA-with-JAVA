import java.util.Scanner;

public class SingleNum {
    public static int single(int arr[],int n){
        int x=0;
        for(int i=0;i<arr.length;i++){
            x=x^arr[i];
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        System.out.println("Enter the Array elements : ");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(single(arr, n));
    }
}
