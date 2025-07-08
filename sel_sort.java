import java.util.*;
public class sel_sort {

    public static int[] selectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex=j;
                }
            }
            if(minIndex != i){
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            } 
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        return arr;
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
        System.out.println("the Selection Sorted Array is : ");

        selectionSort(arr);

    }
}
