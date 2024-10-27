public class LinkedList{

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if (head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if (head==null){
            addFirst(data);
            return;
        }
        tail.next=newNode;
        tail=newNode;


    }
    public void addMiddle (int index,int data){
        if (index == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i =0;
        if (head == null){
            head = tail = newNode;
        }
        while (i<index-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next=newNode;

    }
    public void removeFirst(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        else if (head.next == null){
            head = tail = null;
            return;
        }

        head = head.next;
    }
    public void removeLast(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }else if (head.next == null){
            tail = head = null;
            return;
        }
        Node temp= head;
        while (temp.next.next!=null){
            temp = temp.next;
        }
        temp.next=null;
        tail=temp;

    }
    public void removeMid(int index){
        if (head==null || head.next==null){
            removeLast();
            return;
        }
        Node temp=head;

        for(int i=0; i < index - 1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
    public static void printLL(){
        Node temp;
        temp=head;
        while(temp!=null){
            System.out.print(temp.data+">");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addFirst(40);
        ll.addFirst(50);
        ll.addLast(56);
        ll.removeLast();
        ll.removeFirst();
        ll.removeMid(1);
        printLL();

    }
}



