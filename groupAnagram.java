
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class groupAnagram {
    public List<List<String>> grpAng(String[] str){
        if(str==null || str.length==0){
            return new ArrayList<>();
        }
       Map<String,List<String>> map=new HashMap<>();
       for(String s:str){
        char []ch=s.toCharArray();
        Arrays.sort(ch);

        String key=new String(ch);

        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(s);
       }
       return new ArrayList<>(map.values());
    }

   public static void main(String[] args) {
    String[] words={"ate","eat","tan","lan"};
    groupAnagram g=new groupAnagram();
    System.out.println(g.grpAng(words));

   }
}
