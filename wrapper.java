
import java.util.ArrayList;

public class wrapper {
    public static void main(String[] args) {
       ArrayList<Integer> l1=new ArrayList<>();
       // adding element in list using add method 
       l1.add(5);
       l1.add(6);
       l1.add(7);
       l1.add(8);
       l1.add(9);
    
       // length of arraylist is calculated by size() method
       for(int i=0;i<l1.size();i++){
        // getting all element by index by using get() method
        System.out.println(l1.get(i));
       }
       // printing Arraylist without loop
       System.out.println(l1+" ");
       // adding element at the ith index by add() method
       l1.add(1,100);
       System.out.println(l1);
       //modifying element at ith index is
       l1.set(0, 599);
       System.out.println(l1);
       // remove elements from the ith index
       l1.remove(3);
       System.out.println(l1);
       l1.add(599);
       //removing an element e
       l1.remove(Integer.valueOf(599));
       System.out.println(l1);
       // checking whether the element is exist or not
       boolean ans=l1.contains(Integer.valueOf(99));
       System.out.println((ans));

       System.out.println(l1.remove(Integer.valueOf(9)));
    }
}
