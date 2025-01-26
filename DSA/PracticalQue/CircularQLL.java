public class CQueueLL {
    static class CQueueNode {
        int data;
        CQueueNode next;

        public CQueueNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private CQueueNode head;
    private CQueueNode first;

    // Enqueue operation
    public void enqueue(int data) {
        CQueueNode qnode = new CQueueNode(data);
        if (head == null) {
            head = first = qnode;
        } else {
            qnode.next = head;
            head = qnode;
            first.next = head;
        }
        System.out.println("Queued: " + data);
    }

    // Dequeue operation
    public int dequeue() {
        if (head == null) {
            System.out.println("Queue Underflow!");
            return -1000000;
        }
        if (head == first) { // Single element in the queue
            int x = head.data;
            head = first = null;
            return x;
        }
        int x = first.data;
        CQueueNode temp = head;
        while (temp.next != first) {
            temp = temp.next;
        }
        temp.next = head; // Update the circular link
        first = temp;
        return x;
    }

    // Peek operation
    public int peek() {
        if (first == null) {
            System.out.println("Queue is empty!");
            return -1000000;
        }
        return first.data;
    }

    // Main method for testing
    public static void main(String[] args) {
        CQueueLL qll = new CQueueLL();
        qll.enqueue(1);
        qll.enqueue(2);
        qll.enqueue(3);
        qll.enqueue(4);

        System.out.println("Dequeued: " + qll.dequeue());
        System.out.println("Dequeued: " + qll.dequeue());
        System.out.println("Dequeued: " + qll.dequeue());
        System.out.println("Dequeued: " + qll.dequeue());
        System.out.println("Dequeued: " + qll.dequeue()); // Should show Queue Underflow!

        System.out.println("Peek: " + qll.peek()); // Should indicate the queue is empty
    }
}
