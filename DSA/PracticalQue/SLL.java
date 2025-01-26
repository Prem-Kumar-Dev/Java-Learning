public class SLL {


    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    public static Node head;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void addIndex(int data, int index){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        } else if (index==0) {
            addFirst(data);
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            if (temp.next == null) {
                System.out.println("Out of index:");
                return;
            }
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void deleteFist(){
        if(head == null){
            System.out.println("Empty");
        }
        head = head.next;
    }
    public void deleteLast(){
        if(head == null){
            System.out.println("Empty");
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }
    public void deleteIndex(int index){
        if(head == null){
            System.out.println("Empty");
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            if (temp.next == null) {
                System.out.println("Out of index:");
            }
            temp = temp.next;
        }
        if(temp.next == null){
            System.out.println("Out of index:");
            return;
        }
        temp.next = temp.next.next;
    }
    public void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+">");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SLL sll = new SLL();
        sll.addFirst(10);
        sll.addLast(20);
        sll.addLast(30);
        sll.addLast(40);
        sll.addLast(50);
        sll.addLast(60);
        sll.addLast(70);
        sll.addLast(80);
        sll.addLast(90);
        sll.addIndex(100,8);
        sll.display(sll.head);
        sll.deleteFist();
        sll.deleteLast();
        sll.deleteIndex(7);
        sll.display(sll.head);
    }
}