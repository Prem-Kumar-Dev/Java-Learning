public class QueueLL {
    static class QueueNode{
        int data;
        QueueNode next;
        public QueueNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static QueueNode head;
    public static QueueNode first;

    public void enqueue(int data){
        QueueNode qnode = new QueueNode(data);
        if(head==null){
            head=first=qnode;
            System.out.println("Queued: "+head.data);
            return;
        }
        qnode.next=head;
        head=qnode;
        System.out.println("Queued: "+head.data);

    }
    public int dequeue(){
        if(head==null){
            System.out.println("Stack Underflow!");
            return -1000000;
        }
        if (head == first) {
            int x = head.data;
            head = first = null;
            return x;
        }
        int x = first.data;
        QueueNode temp = head;
        while(temp.next!=first){
            temp=temp.next;
        }
        temp.next=null;
        first=temp;
        return x;
    }
    public int peek(){
        return first.data;
    }

    public static void main(String[] args) {
        QueueLL qll = new QueueLL();
        qll.enqueue(1);
        qll.enqueue(2);
        qll.enqueue(3);
        qll.enqueue(4);
        System.out.println(qll.dequeue());
        System.out.println(qll.dequeue());
        System.out.println(qll.dequeue());
        System.out.println(qll.dequeue());
        System.out.println(qll.dequeue());
        System.out.println(qll.dequeue());
    }
}