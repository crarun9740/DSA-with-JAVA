package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();

        map.put("Akash", 21);
        map.put("Anil", 18);
        map.put("Anshuman", 19);

        System.out.println("Age of "+""+ +map.get("Akash"));
        for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println(map.keySet());
        }
    }
}
