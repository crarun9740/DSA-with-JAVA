package linkedlist;

public class firstLL {
    public static class Node{
        int data; // value
        Node next;// adress of next node

        Node(int data){
            this.data=data;
        }

    }
    public static void main(String[] args) {
        Node a=new Node(2);
        Node b=new Node(3);
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(6);
        Node f=new Node(10);

        //connect all the linkeslist
        a.next=b;
        b.next=f;
        f.next=c;
        c.next=d;
        d.next=e;
        System.out.println(b.next.data);
        System.out.println(f.next.data);

        
    }
    
}
