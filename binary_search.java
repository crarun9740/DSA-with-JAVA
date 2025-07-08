import java.util.Scanner;

public class binary_search {
    public static int[] sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;

    }
    public static int binarySearch(int arr[],int target){
        int low=0;
        int high=arr.length;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid] < target){
                low=mid+1;
            }
            else if(arr[mid] > target){
                high=mid-1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int a=sc.nextInt();
        System.out.println("Enter the Array elemets: ");
        int arr[]=new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       System.out.println("Enter the target: ");
       int target=sc.nextInt();

       sort(arr);
       System.out.println("Sorted array is : ");
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
       System.out.println();

       int res=binarySearch(arr,target);
       if(res != -1){
        System.out.println("Element "+target+" found at index "+res);
       }
       else{
        System.out.println("Element "+ target+" is Not Found!!");
       }
    }
    
}
