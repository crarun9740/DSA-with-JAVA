
import java.util.Arrays;
import java.util.Scanner;

public class sortAbsolutevalue {
static int[] sort(int arr[]){
    int i=0,j=arr.length-1;
    int ans[]=new int[arr.length];
    int k=0;
    while(i<j){
        if(Math.abs(arr[i]) > Math.abs(arr[j])){
            ans[k++]=arr[i]*arr[i];
            i++;
        }
        else{
            ans[k++]=arr[j]*arr[j];
            j--;
        }
    }
    reverse(ans, i, j);
    return ans;
}
static void reverse(int[] arr,int i,int j){
   while(i<j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
   }
   
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int a=sc.nextInt();
        System.out.println("Enter the array elements");
        int arr[]=new int[a];
        for(int i=0 ;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
        int ans[]=sort(arr);


        System.out.println(Arrays.toString(ans));
    }
}
