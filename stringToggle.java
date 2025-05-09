import java.util.Scanner;

public class stringToggle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        StringBuilder s1=new StringBuilder(sc.nextLine());
        System.out.println(s1);

        boolean flag=true;

        for(int i=0;i<s1.length();i++){

            char ch=s1.charAt(i);
            int asci=(int)ch;

            if(asci >= 97)
                flag=false;
            
            if(flag==true){
                asci+=32;
                char dh=(char)asci;
                s1.setCharAt(i, dh);
            }
            else{
                asci-=32;
                char dh=(char)asci;
                s1.setCharAt(i, dh);
            }
            
        }
        System.out.println(s1);

        
    }
}
