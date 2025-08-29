
 class Node{
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        next=null;
    }
}

public class linkedlist{
    Node head;
   
    public void addFirst(int data){
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
    }
    public void addLast(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node last=head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=newnode;
    }
    public void printlist(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }
    public void removelast(){
        if(head!=null){
            System.out.println("Linked List is Empty : ");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node current=head;
        Node last=head.next;
        while(last!=null){
            current=last;
            last=last.next;
        }
        current.next=null;


    }
    public static void main(String[] args) {
        linkedlist l1=new linkedlist();
        l1.addFirst(1);
        l1.addFirst(2);
        l1.addFirst(3);
        l1.addFirst(4);
        l1.addFirst(5);
        l1.printlist();
        l1.addLast(6);
        l1.printlist();
    }
}