import java.util.*;
public class cntgrtr {
    public static void count_elements(int arr[],int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>x){
                count++;
            }
        }
        System.out.println("the number of elements greater than "+x+" is: "+ count);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int a=sc.nextInt();
        System.out.println("Enter the array elements: ");
        int arr[]=new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the key element");
        int x=sc.nextInt();
        count_elements(arr, x);
    }
}
