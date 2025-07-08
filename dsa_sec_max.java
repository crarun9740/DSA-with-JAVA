import java.util.Scanner;

public class dsa_sec_max {
    public static int max(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max=arr[i];
            }
        }
       
        return max;
    }
    public static int second_max(int arr[]){
     int mx=max(arr);

     for(int i=0;i<arr.length;i++){
        if(arr[i]==mx){
            arr[i]=Integer.MIN_VALUE;
        }
     }
     int sec_max=max(arr);
      
        return sec_max;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        System.out.println("Enter the array elements");
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Second largest element : "+second_max(arr));
    }
}
