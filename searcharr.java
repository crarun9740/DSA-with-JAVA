import java.util.*;

public class searcharr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Arrays");
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("Enter the Array Elements");
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
          
        }
        int k=sc.nextInt();
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(k==arr[i]){
                ans=i;
                break;
            }
        }
        System.out.println("found "+ k +" at:"+ans);
       
    }
    
}
