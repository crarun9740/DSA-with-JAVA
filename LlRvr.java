
import java.util.Stack;

class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}
public class LlRvr{
    Node head;
    int size=0;
    public void addFIrst(int data){
        Node newNode=new Node(data);
         size++;
        if(head==null){
            head=newNode;
            return;
        }
        // Node currentNode=head;
        // while(currentNode.next!=null){
        //     currentNode=currentNode.next;
        // }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=newNode;
            return;
        }
        Node currentNode=head;
        while(currentNode.next!=null){
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;

    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
       head=head.next;
       size--;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        if(head.next==null){
            head=null;
            size--;
            return;
        }
        Node curNode=head;
        while(curNode.next.next!=null){
            curNode=curNode.next;
        }
        curNode.next=null;
      
    }
    public void printList(){
        if(head==null){
            System.out.println("List s Empty");
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    public void Reverse(){
        Stack<Node> stack=new Stack<>();

        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            stack.push(currNode);
            currNode=currNode.next;
        }
        head=stack.pop();
        currNode=head;

        while(!stack.isEmpty()){
            currNode.next=stack.pop();
           currNode=currNode.next;
        }
        currNode.next=null;
        
    }
    public static void main(String[] args) {
        LlRvr l1=new LlRvr();
        // l1.addFIrst(1);
        // l1.addFIrst(2);
        // l1.addFIrst(3);
        // l1.addFIrst(4);
        // System.out.println("Add first : ");
        // l1.printList();

        l1.addLast(0);
        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(4);
        System.out.println("Add Last : ");
        l1.printList();

        // // l1.deleteFirst();
        // System.out.println("Delete last");
        // l1.deleteLast();
        // l1.printList();

        l1.Reverse();
        l1.printList();
    }
}