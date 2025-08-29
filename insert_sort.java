import java.util.Arrays;

public class insert_sort {
    public static int[] i_sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while(j >=0 && arr[j] > temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={1,3,6,2,5,0};
        System.out.println(Arrays.toString(i_sort(arr)));
    }
}
