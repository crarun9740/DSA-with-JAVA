import java.util.*;
public class firstRepeat {
    public static int second_repeated(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
               if(arr[i]==arr[j]){
                return arr[i];
               } 
               
            }
        } 
       return -1;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Elements");
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("Array Elements are:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("First repeated element is "+ second_repeated(arr));
    }
}
