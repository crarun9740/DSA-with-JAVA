
import java.util.Arrays;

public class v_Angram {

    public static String reverse(String str){
       char[] s=str.toCharArray();
       String reverse="";

        for(int i=0;i<str.length();i++){
            reverse=s[i]+reverse;
        }
        return reverse;
    }
    public static boolean Isvalid(String str1,String str2){
        char[] s1=str1.toCharArray();
        char[] s2=str2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        if(str1.length()!=str2.length()){
            return false;
        }
       
        return str1.equals(str2);
    }
    public static void main(String[] args) {
        String s1="hello";
        String s2="Arun";
        System.out.println(Isvalid(s1, s2));
    }
}
