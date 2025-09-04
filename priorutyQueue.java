
import java.util.Collections;
import java.util.PriorityQueue;

public class priorutyQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        pq.add(2);
        pq.add(3);
        pq.add(5);
        pq.add(1);
        pq.add(9);
        System.out.println(pq.size());
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
