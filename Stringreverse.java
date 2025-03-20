public class Stringreverse {
    public static void reverse_Str(String str){
        String original_Str=str;
        String rev_Str=" ";
        for(int i=0;i<str.length();i++){
            rev_Str=original_Str.charAt(i)+rev_Str;
        }
        System.out.println(rev_Str);
    }
    public static void main(String[] args) {
        String str="hello";
        reverse_Str(str);
    }
}
