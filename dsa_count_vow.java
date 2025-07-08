import java.util.Scanner;

public class dsa_count_vow {
    public static int count_vow(String str){
        int count=0;
        char[] cnt_vw=str.toCharArray();
        for(int i=0;i<cnt_vw.length;i++){
            char ch=Character.toLowerCase(cnt_vw[i]);

            if(ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        System.out.println("No of Vowels : "+count_vow(str));
    }
}
