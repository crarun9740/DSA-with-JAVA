
import java.util.Scanner;

public class containDup {
    public static boolean duplicateElement(int arr[]){
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    flag=true;
                }
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size 0f array:");
        int a =sc.nextInt();
        System.out.println("Enter array elemenys: ");
        int arr[]=new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(duplicateElement(arr));
    }
}
