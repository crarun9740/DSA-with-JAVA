class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data=data;
        next=null;
    }
}

public class FloydCycle {
    Node head;
      public boolean  floydCycle(){
        if(head==null){
            System.out.println("List is empty :");
            return false;
        }
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;       
            fast = fast.next.next;

            if(slow==fast){
                return true;
            }
           
        }
        return  false;
    }
    public static void main(String[] args) {
        FloydCycle f=new FloydCycle();
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        Node n4=new Node(40);
        Node n5=new Node(50);
        f.head=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n2;

        System.out.println("Does floyd cycle exist? " + f.floydCycle());
    }
}
