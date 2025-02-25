
import java.util.Arrays;
import java.util.Scanner;

public class zeroandoneswapping{
    static int[] swapping(int arr[]){
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]==1 & arr[j]==0){
                swapelement(arr,i,j);
                i++;
                j--;
            }
            if(arr[i]==0){
                
                i++;
               
            }
            if(arr[j]==1){
               j--;
            }
        }
        return arr;
    }
    static void swapelement(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int a=sc.nextInt();
        System.out.println("Enter the array elements: ");
        int arr[]=new int[a];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Sorted 0's and 1's are: ");
        System.out.println(Arrays.toString(swapping(arr)));
    }
}