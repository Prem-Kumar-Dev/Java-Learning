public class LinkedList{

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        LinkedList ll =new LinkedList();
        Node a = new Node(50);
        Node b = new Node(60);
        Node c = new Node(70);
        Node head;
        head=a;
        a.next=b;
        b.next=c;
        c.next=null;

        System.out.println(a.next.data);

    }
}



