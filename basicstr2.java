public class basicstr2 {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        System.out.println(s1.equals(s2));

        String s3=new String("hello");
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));

    }
}
