import java.util.*;
public class Target_sum {
    public static int  Target(int arr[],int target){
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
              if(arr[i]+arr[j]==target){
                ans++;
              }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("Enter the array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target element:");
        int target=sc.nextInt();
        System.out.println("no of pair of "+target+" is: "+Target(arr,target));

    }
}
