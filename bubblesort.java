import java.util.Scanner;

public class bubblesort{
    static int[] Bubble_sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] > arr[j]){
                    swap(arr,i,j);
                }
            }
        }
        return arr ;
    }
    static void Bubble_sort2(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    swap(arr, i, j);
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void Bubble_sort3(int arr[]){
      
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                    
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Bubble sorted elements is:");
        int ans[]=Bubble_sort(arr);
       for(int i=0;i<n;i++){
        System.out.print(ans[i]+" ");
       }
       System.out.println();
       System.out.println("bubble sort by another method");
       Bubble_sort2(arr);
       System.out.println();
       System.out.println("third method for the bubble sort");
       Bubble_sort3(arr);
    }
}