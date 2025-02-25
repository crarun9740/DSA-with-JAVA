import java.util.Scanner;

public class swap {
    static void meth_2(int a,int b){
        System.out.println("before swapping a and b is: "+ a+","+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping a and b is: "+ a+","+b);
    }
    static void meth_3(int a,int b){
        System.out.println("before swapping a and b is: "+ a+","+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("after swapping a and b is: "+ a+","+b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the a and b value");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("before swapping of a and b is: "+ a+","+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping a and b is: "+ a+","+b);
        meth_2(a, b);
        meth_3(a, b);
    }
}
