import java.util.Scanner;

public class stringBasics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=2;i<4;i++){
            System.out.print(s.substring(i));
        }
    }
}
