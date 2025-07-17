import java.util.Scanner;

public class dsa_stringPallindrome {
    public static boolean check_pallindrome(String str,int start,int end){
       char original_str[]=str.toCharArray();
       if(start >= end){
        return true;
       }
       if(str.charAt(start)!=str.charAt(end)){
        return false;
       }
       return check_pallindrome(str, start+1, end-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string :");
        String str=sc.nextLine();
        System.out.println(check_pallindrome(str,0,str.length()-1));
    }
}
