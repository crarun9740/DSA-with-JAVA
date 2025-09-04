import java.util.*;

public class v_groupAna {

    public List<List<String>> valid_group(String[] str){
        if(str==null || str.length==0){
            return new ArrayList<>();
        }
        Map<String,List<String>> map=new HashMap<>();
        for(String s : str){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);

            String key=new String(ch);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
        
    }
    public static void main(String[] args) {
        String word[]={"eat", "tea", "tan", "ate", "nat", "bat"};
       v_groupAna v=new v_groupAna();
       System.out.println(v.valid_group(word));
    }

}
