import java.util.*;
public class SelectionSort_ {
    public static int[] Selection_sort(int arr[]){
        
        for(int i=0;i<arr.length;i++){
           int minInd=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[minInd]){
                minInd=j;
            }
           if(minInd != i){
             int temp=arr[i];
                arr[i]=arr[minInd];
                arr[minInd]=temp;
            }
           }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int n=sc.nextInt();
        System.out.println("Enter the Array elements : ");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Selection sorted Array is : ");
        Selection_sort(arr);
    }
}
