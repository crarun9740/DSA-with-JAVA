import java.util.Scanner;

public class InserionSort {
    public static int[] sort_in(int arr[]){
        for(int i=1;i<arr.length;i++){
           int j=i;
           
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        return arr;
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int n=sc.nextInt();
        System.out.println("Enter the Array element : ");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Selection Sorted Array is : ");
        sort_in(arr);

    }
}
