package linkedlist;

public class Implementation {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    public static class linkedList{
        Node head=null;
        Node tail=null;

        void insertAtEnd(int val){
           Node temp=new Node(val);
          if(head==tail){
            head=temp;
          }
          else{
            tail.next=temp;
          }
          tail=temp; 
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print("linked list:"+" "+temp.data);
                temp=temp.next;
            }
        }
   
    }
    public static void main(String[] args) {
        linkedList ll=new linkedList();
        ll.insertAtEnd(5);
        ll.insertAtEnd(4);
        ll.insertAtEnd(2);
        ll.display();
        
    }
}
