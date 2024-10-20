public class DLL {

    class Node{
        int data;
        Node prev, next;

        public Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }

    }
    public static Node head;
    public static Node tail;
    public static int size;

    //add
    public void addFirst(int data){
        Node newNode = new Node(data);
        if (head==null){
            head=tail=newNode;
            size++;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        size++;


    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if (tail==null){
            head=tail=newNode;
            size++;
            return;
        }
        newNode.prev=tail;
        tail.next=newNode;
        tail=newNode;
        size++;


    }
    public void removeFirst(){
        if (head==null){
            System.out.println("No linked list found");
            return;
        }else if (head.next==null){
            head=tail=null;
            size--;
            return;
        }
        head=head.next;
        head.prev=null;
        size--;
    }
    public void removeLast(){
        if (head==null){
            System.out.println("No linked list found");
            return;
        }else if (head.next==null){
            head=tail=null;
            size--;
            return;
        }
        tail=tail.prev;
        tail.next=null;
        size--;
    }
    public void reverseDLL(){

    }

    public static void printDLL(){


        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+">");
            temp = temp.next;

        }
        System.out.println();
    }

    public static void main(String[] args) {
        DLL dll =new DLL();

        dll.addFirst(10);
        dll.addFirst(12);
        dll.addFirst(13);
        dll.addFirst(14);
        dll.addFirst(15);
        dll.addLast(16);
        dll.removeFirst();
        dll.removeFirst();
        dll.removeLast();
        printDLL();
        System.out.println(dll.size);

    }
}