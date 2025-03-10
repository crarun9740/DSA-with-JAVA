
import java.util.ArrayList;
import java.util.Collections;

public class Arraylistrvr {
    static void reverseList(ArrayList<Integer> l1){
        int i=0,j=l1.size()-1;

        while(i<j){
            Integer temp=Integer.valueOf(l1.get(i));
            l1.set(i,l1.get(j));
            l1.set(j,temp);

            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(0);
        l1.add(10);
        l1.add(3);
        l1.add(5);
        l1.add(22);
        l1.add(10);
        System.out.println("Orinal Arraylist:");
        System.out.println(l1);
        // reverseList(l1);
        Collections.reverse(l1);
        System.out.println("Reversed ArrayList is:");
        System.out.println(l1);
        Collections.sort(l1);
        System.out.println("Sorted list in Acending order:");
        System.out.println(l1);
        System.out.println("sort element in descending order");
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println(l1);
    }
}
