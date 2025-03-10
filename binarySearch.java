import java.util.Scanner;

public class binarySearch {
    static int[] Binary_Src(int arr[],int Target){
        int left=0,right=arr.length-1;

        while(left <=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==Target){
              return mid;
            }
            
            else if(arr[mid]<Target){
                left=mid+1;
            }
           else{
            right=mid-1;
           }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scaner(System.in);
        System.out.println("Enter the size of Array");
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("Enter the array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to search");
        int Target=sc.nextInt();
    }
}
