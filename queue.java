public class queue{
    public static int front=-1,rear=-1;
    private static int max_size=100;
    public static int arr[]=new int[max_size];

    public boolean IsEmpty(){
        return (front==-1 && rear==-1);
    }
    public boolean IsFull(){
        return (rear==max_size-1);
    }
    public void enque(int item){
        if(IsFull()){
            System.out.println("Queue is full");
        }
        else if(IsEmpty()){
            rear=front=0;
        }
        else{
            rear++;
        }
        arr[rear]=item;
        System.out.println("pushed item: "+item);
    }
    public void deque(){
        if(IsEmpty()){
            System.out.println("queue is empty");
        }
        else if (front==rear) {
            front=rear-1;
        }
        else{
            front++;
        }
    }
    public int getFront(){
        if(IsEmpty()){
            System.out.println("Queue is empty : ");
            return -1;
        }
        return arr[front];
    }
      public int getRear(){
        if(IsFull()){
            System.out.println("Queue is empty : ");
            return -1;
        }
        return arr[rear];
    }
    public static void main(String[] args) {
        queue q=new queue();
        q.enque(2);
        q.deque();
    }
}