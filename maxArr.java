import java.util.Scanner;
public class maxArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
      
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>ans){
                ans=arr[i]; 
            }
        }
      System.out.println(ans);
      
    }
}
