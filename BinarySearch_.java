
import java.util.Scanner;

public class BinarySearch_ {

    public static int[] sortedArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Sorted Array is : ");
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        return arr;
    }
    public static int binary(int arr[],int k){
        int low=0;
        int high=arr.length;

        while(low <= high){
            int mid=low+(high-low)/2;
            if(arr[mid]==k){
                return mid;
            }
            else if(arr[mid] < k){
                low=mid+1;
            }
            else if(arr[mid] > k){
                high=mid-1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n=sc.nextInt();
        System.out.println("Enter the Array elements");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter element to be searched : ");
        int k=sc.nextInt();
        
        sortedArray(arr);
       int result= binary(arr, k);

       if(result!=-1){
        System.out.println("Element "+k+" found at index "+result);
       }
       else{
        System.out.println("Element not Found!!!");
       }

    }
}
