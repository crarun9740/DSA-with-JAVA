
import java.util.Scanner;

public class MissingNum {
    public static int Missing(int arr[]){
        int sum=0;
        int a=arr.length;
        int expected_sum=a*(a+1)/2;
        for(int i=0;i<arr.length-1;i++){
            sum=sum+arr[i];
        
        }
        return expected_sum-sum;
    }
    public static int[] twosum(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        System.out.println("Enter the array elements:");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Target : ");
        int target=sc.nextInt();
        System.out.println(Missing(arr));
       int[] result=twosum(arr, target);
       if(result.length==2){
        System.out.println(arr[0] +" "+ arr[1]);
       }
      
    }
}
