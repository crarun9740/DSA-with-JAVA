import java.util.Scanner;

public class prefixsum {
    public static int[] runorprefixsum(int[] arr){
        int n=arr.length;
        int[] pref=new int[n];
        pref[0]=arr[0];
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+arr[i];
        }
        return pref;
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("Enter the array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array is:");
        printArray(arr);
        System.out.println();
        System.out.println("prefix sum of arrays");
        int pref[]=runorprefixsum(arr);
        for(int x:pref){
            System.out.print(x+" ");
        }
        
    }
}
