import java.util.*;
public class swapby_twoponter {
    static void swap(int arr[]){
        int i=0,j=arr.length-1;
        while(i<j){
            swap_method(arr, i, j);
            i++;
            j--;
        }
    } 
    static void swap_method(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array");
    int a=sc.nextInt();
    int arr[]=new int[a];
    System.out.println("Enter the array elements");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    swap(arr);
   }
}
