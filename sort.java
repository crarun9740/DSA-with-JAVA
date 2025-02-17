import java.util.*;
public class sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("Enter the array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        boolean check=false;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>=arr[i-1]){
                check=true;
                System.out.println("Array is sorted :"+check);
                break;
            }
            else{
                System.out.println("Array is not sorted: "+check);
            }    
        }
    }
}
