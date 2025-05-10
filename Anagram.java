
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static boolean AnagramChecker(String s,String t){
        if(s.length()==t.length()){
            char[] sArray=s.toLowerCase().toCharArray();
            char[] tArray=t.toLowerCase().toCharArray();

            Arrays.sort(sArray);
            Arrays.sort(tArray);

           return Arrays.equals(sArray, tArray);
            
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string s");
        String s=sc.nextLine();
        System.out.println("Enter the string t");
        String t=sc.nextLine();
       System.out.println( AnagramChecker(s, t));
    }
}
