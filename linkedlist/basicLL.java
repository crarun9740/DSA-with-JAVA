package linkedlist;

public class basicLL {
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void recursiveDisplay(Node head){
        Node temp=head;
        if(temp==null) return;
        recursiveDisplay(temp.next);
        System.out.print(temp.data+" ");

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
        Node e=new Node(6);
        //connecting them by their address
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        //printting all using a
        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
        System.out.println(a.next.next.next.data);


        System.out.println("Singly linked list :");
       display(a);
       System.out.println();
       System.out.println("Reversed linked list : ");
       recursiveDisplay(a);
    }
}
