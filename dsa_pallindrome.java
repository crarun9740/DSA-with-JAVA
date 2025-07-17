import java.util.Scanner;

public class dsa_pallindrome{
    public static void check_pallindrome(int num){
        int original_num=num;
        int rever=0;
        while(num!=0){
            int ld=num%10;
            rever=rever*10+ld;
            num=num/10;
        }
        System.out.println("Original num : "+original_num);
        System.out.println("reversed integer : "+rever);

        if(original_num == rever){
            System.out.println("It is Pallindrome");
        }
        else{
            System.out.println("Not Pallindrome");
        }
       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the integer");
        int num=sc.nextInt();
        check_pallindrome(num);
        

     
    }
}