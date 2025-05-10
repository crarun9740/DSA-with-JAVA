import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
       HashMap<Integer,String> map = new HashMap<>();
       map.put(1,"Arun");
       map.put(2,"sanika");
       map.put(3,"renuka");

       System.out.println(map);

       map.put(3,"sangeeta");

       System.out.println(map);

       for(Map.Entry<Integer,String> e : map.entrySet()){
        System.out.println(e.getValue());
        System.out.println(e.getKey());
       }
    }
}
