import java.util.*;
public class Rotate_arr {
    static int[] rotate(int arr[],int k){
        int n=arr.length;
        k = k % n;
        int j=0;
        int[] ans=new int[n];
        for(int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }

        for(int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("Enter the array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter k Rotation:");
        int k=sc.nextInt();
        System.out.println("Original Array");
        System.out.println( Arrays.toString(arr));
        System.out.println("K rotated array");
        int ans[]=rotate(arr, k);
        System.out.println(Arrays.toString(ans));
    }
}
