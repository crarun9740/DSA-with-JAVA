import java.util.Scanner;

public class selectionsort {
    public static void Selection_sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp; 
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        System.out.println("enter the array elements");
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Selection_sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        
    }
}
