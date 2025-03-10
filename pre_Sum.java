import java.util.Scanner;

public class pre_Sum {

    static int[] prefix_Sum(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of array:");
    int a=sc.nextInt();
    System.out.println("Enter the array elements");
    int arr[]=new int[a];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Original array:");
  for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
  }
  System.out.println();
  System.out.println("Prefix sum of");
    int pref[]=prefix_Sum(arr);
    for (int x : pref) {
        System.out.print(x+" ");
    }
   } 

}
