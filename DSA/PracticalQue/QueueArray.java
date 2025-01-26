public class QueueArray {
    static class Queue{
        int data;
        int pos;
        int first;
        int[] arr;

        public Queue(int n){
            pos=-1;
            first=0;
            arr = new int[n];
        }
        public void enqueue(int data){
            if(pos<arr.length-1){
                pos++;
                arr[pos]=data;
                System.out.println("Queued: "+arr[pos]);
                return;
            }
            System.out.println("Overflow!");
        }
        public int dequeue(){
            if(pos==-1 || first>pos){
                System.out.println("Underflow!");
                return -1000;
            }
            int x = arr[first];
            arr[first]=0;
            first++;
            return x;
        }
        public int peek(){
            if(pos==-1 || first>pos){
                System.out.println("Empty");
                return -1000;
            }
            return arr[first];
        }



    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        System.out.println(q.peek());
        q.enqueue(7);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.peek());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

    }
}