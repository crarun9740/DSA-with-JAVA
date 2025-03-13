import java.util.Scanner;

public class Krotate {
    public static void kRotate(int arr[],int k){
        int n=arr.length;
        k=k%n;
        int i=0,j=n-1 ;
        swap(arr, 0, j);
        swap(arr, 0,k-1 );
        swap(arr, k, n-1);
        
    }
    static void swap(int arr[],int i,int j){
        while(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
        }
    }
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        System.out.println("Enter the Array elements");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the size of k to Rotate");
        int k=sc.nextInt();
        kRotate(arr, k);
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
       
    
    }
}
