
import java.util.HashSet;

class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data=data;
        next=null;
    }
}

public class removeDupUnsorted {
    Node head;
   public void duplicateRemoveUnsorted(){

    HashSet<Integer> hash=new HashSet<>();

    Node curNode=head;
    Node prevNode=null;

    while(curNode!=null){
        if(hash.contains(curNode.data)){
            prevNode.next=curNode.next;
        }
        else{
            hash.add(curNode.data);
            prevNode=curNode;
        }
        curNode=curNode.next;
    }
    }
    public void printlist(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node cuNode=head;
        while(cuNode!=null){
            System.out.print(cuNode.data+"->");
            cuNode=cuNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        removeDupUnsorted l1=new removeDupUnsorted();

        Node n1=new Node(1);
        Node n2=new Node(3);
        Node n3=new Node(2);
        Node n4=new Node(5);
        Node n5=new Node(2);

        l1.head=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=null;
        l1.printlist();
        l1.duplicateRemoveUnsorted();
        l1.printlist();
    }
}
