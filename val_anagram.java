import java.util.Arrays;
import java.util.Scanner;

public class val_anagram {
    public static boolean valid_Anagram(String s1,String s2){
        char[] str1=s1.toCharArray();
        char[] str2=s2.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str1);
        if(str1.length==str2.length){
           str1.equals(str2);
        //    System.out.println("str1: "+str1);
        //    System.out.println("str2: "+str2);
           System.out.println("valid Anagram");
           return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String 1 and  String 2");
        String str1=sc.nextLine();
        String str2=sc.nextLine();
       System.out.println( valid_Anagram(str1,str2));
    }
}
