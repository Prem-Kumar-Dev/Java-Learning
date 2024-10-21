public class Question3 {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        return;

    }


    public static void printLL() {
        if (head == null) {
            System.out.println("Empty LL!");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public Node prevNode(int n){
        if (n==1){
            return null;
        }
        Node prev=head;
        for (int i=1;i<n-1 && prev!=null;i++){
            prev=prev.next;
        }
        return prev;
    }
    public void swapNode(int n,int m){
        Node prev1=prevNode(n);
        Node curr1=prev1.next;
        Node prev2=prevNode(m);
        Node curr2=prev2.next;

        prev1.next=curr2;
        prev2.next=curr1;
        Node temp=curr2.next;
        curr2.next=curr1.next;
        curr1.next=temp;
    }

    public static void main(String[] args) {
        Question3 ll =new Question3();

        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        printLL();
        ll.swapNode(2,3);
        printLL();
    }
}