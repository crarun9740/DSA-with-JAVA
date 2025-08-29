
import java.util.Stack;

class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data=data;
        next=null;
    }

}
public class reverseLinkedList {
    Node head;
    int size=0;

    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=newNode;
            return;
        }
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
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void printlist(){
        if(head==null){
            System.out.println("List is Empty..");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
           
        }
         System.out.println("null");
    }
    public void deletefirst(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        head=head.next;
        size--;
        
    }
    public void deletelast(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        if(head.next==null){
            head=null;
            size--;
            return;
        }
        Node currNode=head;
        while(currNode.next.next!=null){
            currNode=currNode.next;
        }
        currNode.next=null;
        size--;
    }
    public void searchLL(int key){
        boolean flag=false;
        Node currNode=head;
        while(currNode!=null){
            if(currNode.data==key){
                flag=true;
                break;
            }
            currNode=currNode.next;
        }
        System.out.println(flag);
       
    }

    public void reversell(){
        if(head==null || head.next==null){
            System.out.println("List is empty");
            return;
        }
        Stack<Node> stack=new Stack<>();
        Node currNode=head;
        //push into stack
        while(currNode!=null){
            stack.push(currNode);
            currNode=currNode.next;
        }
        //pop from stack

        head=stack.pop();
        currNode=head;
        while(!stack.isEmpty()){
            currNode.next=stack.pop();
            currNode=currNode.next;
        }
        currNode.next=null;
    }
    public void lengthofLL(){
        int len=0;
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node cuNode=head;
        while(cuNode!=null){
            len=len+1;
            cuNode=cuNode.next;
        }
        System.out.println("length of linkedList : "+len);
    }
    public void MidofLl(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("mid of ll is : "+slow.data);
      
    }
    public void Nthnode(int data){
        Node currNode=head;
        int count=1;

        while(currNode!=null && count < data){
            currNode=currNode.next;
            count++;
        }
        if(currNode!=null){
            System.out.println("Nth Node of the LL is "+currNode.data);
        }
        else{
            System.out.println("Position " + data + " is out of range");
        }
    }
    public static void main(String[] args) {
        reverseLinkedList l1=new reverseLinkedList();
        l1.addFirst(10);
        l1.addFirst(20);
        l1.addFirst(30);
        l1.addFirst(40);
        l1.addLast(50);
        l1.printlist();
        l1.deletefirst();
        l1.deletelast();
        l1.reversell();
        l1.printlist();
        l1.searchLL(5);
        l1.lengthofLL();
        l1.deletefirst();
        l1.MidofLl();
        l1.Nthnode(2);
    }
}
