
import java.util.Scanner;

public class freq {
    static int[] makefrequencyArray(int arr[]){
        int fr[]=new int[10005];
        for (int i = 0; i < arr.length; i++) {
            fr[arr[i]]++;
        }
        return fr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int a=sc.nextInt();
        System.out.println("Enter the "+a+" Array elements");
        int arr[]=new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int freq[]=makefrequencyArray(arr);

        System.out.println("Enter the number of queries: ");
        int q=sc.nextInt();


        while(q  >  0){
            System.out.print("Enter thr number to be searched : ");
            int x=sc.nextInt();
            if(freq[x] > 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            q--;
        }
    }
}
