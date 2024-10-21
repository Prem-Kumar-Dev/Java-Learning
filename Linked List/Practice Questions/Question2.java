//delete m numbers of node after n node;
import java.util.LinkedList;

public class Question2 {

    public void removeMfromN(){

    }

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        System.out.println(ll);
        Node head=ll.peekFirst();
        System.out.println(head.next);
    }
}