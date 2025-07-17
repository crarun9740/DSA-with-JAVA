import java.util.Arrays;
import java.util.Scanner;

public class recursion_N {
    public static void recursion_Num(int n){
        if(n == 0){
            return;
        }
        recursion_Num(n-1);
        System.out.print(n+" ");
    }
    public static void recursive_Nto1(int n){
       if(n < 0){
        return;
       }
        System.out.print("N numbers"+n);
       recursive_Nto1(n-1);
     
    }
     public static int Sum(int n){
        if(n == 0){
            return 0;
        }
        return n+Sum(n-1);
       
     }
     public static int factorial(int n){
        if(n==0 || n == 1 ){
            return 1;
        }
        return n*factorial(n-1);
     }
     public static void reverse_(int arr[],int start,int end){
        if(start >= end){
            return;
        } 
        int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        reverse_(arr,start+1,end-1);
     }
     public static boolean  pallindrome(int arr[],int start,int end){
        int origna[]=arr;
        if(start>=end){
            return true;
        }
        if(arr[start] != arr[end]){
            return false;
        }
        return pallindrome(arr, start+1, end-1);

     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        System.out.println("Enter the Array element");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        recursion_Num(n);
        System.out.println();
        System.out.println("sum of N :"+Sum(n));
        System.out.println("Factorial Number : "+ factorial(n));
        reverse_(arr,0,arr.length-1);
        System.out.println("Reversed Array : "+Arrays.toString(arr));
       
        System.out.println( pallindrome(arr, 0, arr.length-1));
    }
}
