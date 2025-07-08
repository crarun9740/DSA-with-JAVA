import java.util.*;


public class BubbleSort_ {

    public static int[] bubble_sort(int arr[]){
        for(int i = 0;i<arr.length;i++){
            for(int j=i+1 ; j<arr.length;j++){
                if(arr[i] > arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n=sc.nextInt();
        System.out.println("Enter the Array elements");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The Bubble sorted array is: ");
        bubble_sort(arr);

    }
}
