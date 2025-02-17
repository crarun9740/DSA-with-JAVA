import java.util.*;
public class occurence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int a=sc.nextInt();
        System.out.println("Enter the Array elements");
        int arr[]=new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            
        }
        int occur=0;
        int k=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                occur++;
            }
        }
        System.out.println("no of time "+ k+ " occurence is: "+occur);
    }
    
}
