
import java.util.HashSet;

public class ContainsDuplicate{

    static boolean duplCont(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    static boolean dupcl(int arr[]){
        HashSet<Integer> hash=new HashSet<>();
        for(int num : arr){
            if(!hash.add(num)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4};
       System.out.println( duplCont(arr));
       System.out.println(dupcl(arr));
    }
}