class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data=data;
        next=null;
    }
}
public class mergeTwosortedll {
    Node head;
    public void printlist(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public Node merge(Node l1,Node l2){
        Node dummy=new Node(-1);
        Node tail=dummy;
        while(l1!=null && l2!=null){
            if(l1.data<l2.data){
                tail.next=l1;
                l1=l1.next;
            }
            else{
                tail.next=l2;
                l2=l2.next;
            }
            tail = tail.next;
        }
        if(l1!=null){
            tail.next=l1;
        }
        else{
            tail.next=l2;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        mergeTwosortedll l1=new mergeTwosortedll();
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);
        Node n4=new Node(5);
        Node n5=new Node(6);
        Node n6=new Node(7);

        l1.head=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=null;
        l1.printlist();

        mergeTwosortedll l2=new mergeTwosortedll();

        l2.head=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=null;
        l2.printlist();

        mergeTwosortedll obj=new mergeTwosortedll();
        Node mergehead=obj.merge(l1.head, l2.head);

        System.out.println("Merged List : ");
        obj.head=mergehead;
        obj.printlist();
    

    }
}
