
import java.util.ArrayList;
import java.util.Collections;

public class listStringsort {
    public static void main(String[] args) {
        ArrayList<String> s1=new ArrayList<>();
        s1.add("welcome");
        s1.add("to");
        s1.add("bijapur");
        s1.add("og");
        System.out.println(s1);
        Collections.sort(s1,Collections.reverseOrder());
        System.out.println(s1);
        System.out.println(Integer.MIN_VALUE);
    }
}
