class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data=data;
        next=null;
    }
    
}

public class Removeduplicatefromll {
    Node head;
    public void printlist(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    public void dupplicateRemove(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode=head;
       

        while(currNode!=null && currNode.next!=null){
            if(currNode.data==currNode.next.data){
                currNode.next=currNode.next.next;
            }
            else{
                currNode=currNode.next;
            }
        }
    }
    public static void main(String[] args) {
        Removeduplicatefromll l1=new Removeduplicatefromll();
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(2);
        Node n4=new Node(4);
        Node n5=new Node(4);
       
        l1.head=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=null;
        l1.printlist();
        l1.dupplicateRemove();
        l1.printlist();



    }
}

