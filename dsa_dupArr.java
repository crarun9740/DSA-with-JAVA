import java.util.Scanner;

public class dsa_dupArr {
    public static void arr_dup(int arr[]){
        int nearr[]=new int[arr.length];
        int j=0;

        for(int i=0;i<arr.length-1;i++){
           if(arr[i+1] != arr[i]){
            nearr[j++]=arr[i];
           }
        }
        nearr[j++]=arr[arr.length-1];
        for(int i=0;i<j;i++){
            System.out.print(nearr[i]+ " ");
        }
    }
    public static void sort(int arr[]){
        for(int i = 0 ;i <arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
            if(arr[j] < arr[i]){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
           }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(" " +arr[i]);
        }
    }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array : ");
    int a=sc.nextInt();
    System.out.println("Enter the Array elements : ");
    int arr[]=new int[a];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Removed duplicate elements");
    sort(arr);
   } 
}
