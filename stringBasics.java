import java.util.Scanner;

public class stringBasics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="abcd";
        for(int i=0;i<=3;i++){
            for(int j=i+1;j<=4;j++){
                System.out.print(s.substring(i,j)+" ");
            }
        }
    }
}
