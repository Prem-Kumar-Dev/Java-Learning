public class CircularQueue {

    static class CircularQ {
        private int front, rare, size;
        private int[] arr;

        CircularQ(int size) {
            this.front = -1;
            this.rare = -1;
            this.size = size;
            this.arr = new int[size];
        }

        public void enQueue(int x) {
            if ((rare + 1) % size == front) {
                System.out.println("Overflow!");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rare = (rare + 1) % size;
            arr[rare] = x;
        }

        public void deQueue() {
            if (front == -1) {
                System.out.println("Underflow!");
                return;
            }
            System.out.println("Dequeued: " + arr[front]);
            if (front == rare) {
                front = rare = -1;
            } else {
                front = (front + 1) % size;
            }
        }

        public void display() {
            if (front == -1) {
                System.out.println("Queue is Empty!");
                return;
            }
            System.out.print("Queue: ");
            int i = front;
            while (true) {
                System.out.print(arr[i] + " ");
                if (i == rare) {
                    break;
                }
                i = (i + 1) % size;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CircularQ cq = new CircularQ(5);

        cq.enQueue(10);
        cq.enQueue(20);
        cq.enQueue(30);
        cq.enQueue(40);
        cq.enQueue(50);
        cq.display();

        cq.enQueue(60);

        cq.deQueue();
        cq.deQueue();
        cq.display();

        cq.enQueue(60);
        cq.display();
    }
}
