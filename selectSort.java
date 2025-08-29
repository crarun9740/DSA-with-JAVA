
import java.util.Arrays;

public class selectSort {
    static int[] sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
           int minindex=i;
           for(int j=i+1;j<arr.length;j++){
            if(arr[j] < arr[minindex]){
                minindex=j;
            }
           }
           int temp=arr[minindex];
           arr[minindex]=arr[i];
           arr[i]=temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={2,4,1,5,8,7,6};
        System.out.println(Arrays.toString(sort(arr)));
    }
}
