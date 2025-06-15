import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of Array :");
        int n=sc.nextInt();
        System.out.println("Enter array elements are :");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to Search");
        int k=sc.nextInt();

        for(int i=0;i<arr.length;i++){
            if(k==arr[i]){
                System.out.println("Element is Found!..at"+" "+arr[i-1]);
                break;
            }
        }
    }
}
