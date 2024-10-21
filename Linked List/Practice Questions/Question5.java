import java.util.Scanner;

public class Question5 {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;

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

    public void printLL() {
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

    public static Question5 mergeLL(Question5 ll1,Question5 ll2){
        ll1.tail.next=ll2.head;
        ll1.tail=ll2.tail;
        return ll1;

    }

    public static void main(String[] args) {
        Question5 ll1= new Question5();
        Question5 ll2=new Question5();
        Question5 ll3=new Question5();

        ll1.addFirst(3);
        ll1.addFirst(1);

        ll2.addFirst(8);
        ll2.addFirst(6);

        ll3.addFirst(10);
        ll3.addFirst(9);

        ll1.printLL();
        ll2.printLL();
        ll3.printLL();

        ll1=mergeLL(ll1,ll2);
        ll1=mergeLL(ll1,ll3);
        ll1.printLL();


    }
}