public class i_sort {
    public static int[] i_sort(int arr[]){
      for(int i=0;i<arr.length;i++){
        int temp=arr[i];
        int j=i-1;
        while(j >=0 && arr[j]>temp){
            arr[j+1]=arr[j];
            j--;
        }
        return arr;
        
      }
    }
}
