import java.util.Scanner;

public class SumOfelement {
    static void sum_elem(int[] arr,int k){
        boolean found=false;
        for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==k){
                System.out.println(arr[i]+ " "+arr[j]);
                found=true;
                break; 
            }
            
           }
        } 
        if(!found){
            System.out.println("-1");
        }
    }
   public static void main(String args[]){
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
        sum_elem(arr, k);
   }

}
