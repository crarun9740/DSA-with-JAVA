
import java.util.HashMap;
import java.util.Map;

public class dsa_hash_freq {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,3,2,4};

        HashMap<Integer,Integer> freqmap=new HashMap<>();
        for(int num : arr){
            if(freqmap.containsKey(num)){
                freqmap.put(num, freqmap.get(num)+1);
            }
            else{
                freqmap.put(num,1);
            }
        }
        for(Map.Entry<Integer,Integer>entry:freqmap.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
