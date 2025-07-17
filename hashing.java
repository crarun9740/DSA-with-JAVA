import java.util.*;

public class hashing {
    public static void main(String[] args) {
       HashMap<String,Integer>map=new HashMap<>();
       map.put("Arun",21);
       map.put("sanika",22);
       System.out.println(map);

       System.out.println(map.containsKey("Arun"));
       System.out.println(map.get("Arun"));

       if(map.containsKey("Arun")){
        System.out.println("Arun is present in database");
       }
       for(Map.Entry<String,Integer> entry : map.entrySet()){
        System.out.println(entry.getKey()+ " : "+entry.getValue());
       }
    }
}
