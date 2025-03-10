import java.util.*;
public class prefix {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
    static int[] prefix__sum(int[] arr){
        int n=arr.length;
        int sum=0;
       
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Size of Array");
       int a=sc.nextInt();
       System.out.println("Enter the Array elements");
       int arr[]=new int[a];
       for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
       } 
      int pref[]=prefix__sum(arr);
       System.out.println("prefix sum of array");
       for (int x : pref) {
        System.out.print(x+" ");
       }
       
    }
}
