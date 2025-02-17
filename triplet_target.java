import java.util.*;
public class triplet_target {
    public static int target_sum(int arr[],int target){
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=i+2;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");~
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("Enter the Array elements");
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target element");
        int target=sc.nextInt();
        System.out.println(target_sum(arr, target));
    }
}
