import java.util.Scanner;

public class revers_str {
    public static String reversedString(String str){
        // String original_str=str;
        String Reverse="";
        for(int i=0;i<str.length();i++){
            Reverse=str.charAt(i)+Reverse;
        }
        return Reverse.toLowerCase();
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();
        System.out.println("Reversed string is: ");
        System.out.println(reversedString(str));
    }
}
