import java.util.*;

public class unique {
    public static int  find_Unique(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;i<n;i++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int ans=-1;
        for(int i=0;i<n;i++){
            if(arr[i] > 0){
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("Enter the Array Elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The unique element is: "+find_Unique(arr));
    }
}
