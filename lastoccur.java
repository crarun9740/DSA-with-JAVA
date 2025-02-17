import java.util.*;

public class lastoccur {
    
    public static void last_occurence(int arr[],int k){
        int count=0;
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                count++;
                ans=i;
            }
        }
        System.out.println("no of occurence "+k+" is: "+count);
        System.out.println("last occurence at: "+ans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("Enter the Array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            
        }
        System.out.println("Enter the element of key occurence");
        int k=sc.nextInt();
        last_occurence(arr, k);

    }
    
}
