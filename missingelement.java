public class missingelement {
    static int Missing_element_logn(int arr[]){
        int start=0;
        int end=arr.length;
        int ans=0;
        while(start <= end){
            int index=0;
            int mid=start+(end-start)/2;
            if(arr[mid+1]==mid){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return start+1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6};
        System.out.println(Missing_element_logn(arr));
    }
}
