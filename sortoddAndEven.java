
import java.util.Arrays;
import java.util.Scanner;

public class sortoddAndEven {
    static int[] SortedOddandEven(int arr[]){
        int i=0 ,j=arr.length-1;
        while(i < j){
            if(arr[i]%2==1 && arr[j] % 2==0){
                swap(arr, i, j);
                i++;
                j--;
            }
            if(arr[i]%2==0){
                i++;
            }
            if(arr[j]%2==1){
                j--;
            }
        }
       return arr;
    }
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int a=sc.nextInt();
        System.out.println("Enter the Array elements:");
        int arr[]=new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("original Array :"+ Arrays.toString(arr));
        System.out.println(Arrays.toString(SortedOddandEven(arr)));
    }
}
