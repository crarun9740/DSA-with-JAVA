import java.util.Arrays;
import java.util.Scanner;

public class zeroswap {
    static int[] swap(int arr[]){
        int zero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zero++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(i < zero){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int a=sc.nextInt();
        System.out.println("Enter the Array elements");
        int arr[]=new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(swap(arr)));
    }
}
