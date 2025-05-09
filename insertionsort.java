import java.util.Scanner;

public class insertionsort{
    public static void insertion_Sort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int j=i;

            while(j > 0 && arr[j] < arr[j-1]){

                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
          

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        System.out.println("Enter the array elements");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }stri
        insertion_Sort(arr);
        System.out.println("Insertion Sorted array is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}