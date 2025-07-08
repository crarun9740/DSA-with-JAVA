import java.util.Scanner;

public class dsa_big_small {
    
    public static int large_Element(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
                if(arr[i] > arr[0]){
                    max=arr[i];

                }
        }
        return max;
    }
    public static int small_elements(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int n=sc.nextInt();
        System.out.println("Enter the Array elements :");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("largest element in the array is: "+large_Element(arr));
        System.out.println("smallest element in the array is: "+small_elements(arr));
    }
}
