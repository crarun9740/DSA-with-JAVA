class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data=data;
        next=null;
    }

}
public class Addtwonumber {
    Node head;
    public void printlist(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node curr=head;
     while(curr!=null){
        System.out.print(curr.data+"->");
        curr=curr.next;
     }
     System.out.println("null");
    }
    public Node sumNum(int data){
        Node curr=head;
        while(curr!=null){
            
        }
    }
    public static void main(String[] args) {
        Addtwonumber l1=new Addtwonumber();

        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);

        l1.head=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=null;
    }
}
