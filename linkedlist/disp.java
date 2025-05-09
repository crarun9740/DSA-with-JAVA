package linkedlist;

public class disp {
    public static  class Node{
        int data;
        Node next;

        Node(int data) {
            this.data=data;
        } 
    }
    public static  void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(" "+temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);

        a.next=b;
        b.next=c;
        c.next=d;
        System.out.println("Linked List Elements are : ");
        display(a);

    }
}
