import java.util.Arrays;
import java.util.Scanner;

public class sortzeros {

    static int[] sort(int arr[]){
       
        int i=0,j=arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
        return arr;
    }
    static void swap(int arr[],int i,int j){
     int temp= arr[i];
     arr[i]=arr[j];
     arr[j]=temp;
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int a=sc.nextInt();
        System.out.println("Enter the Array elements");
        int arr[]=new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Sorted array is: "+ Arrays.toString(sort(arr)));
       
    }
}
