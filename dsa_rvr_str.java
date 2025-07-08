import java.util.*;
public class dsa_rvr_str{
   public static void rvr_str(String str){
    String original=str;
    String rvr=" ";
    for(int i=0;i <str.length(); i++){
        rvr=original.charAt(i)+rvr;
    }
    System.out.println("First method  :"+rvr);
   }
   public static void reverse(String str){
    String rvr="";
    for(int i=str.length()-1;i>=0;i--){
        rvr+=str.charAt(i);
    }
    System.out.println("Second method  :"+rvr);
   }
 
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=sc.nextLine();
        rvr_str(str);
        reverse(str);
    }
}