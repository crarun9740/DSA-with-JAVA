package linkedlist;

public class lengthofLl {
    static void lengthData(Node head){
        Node temp=head;
        int len=0;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        System.out.println("length of linked list :"+len);
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
    lengthData(a);
    }
}
