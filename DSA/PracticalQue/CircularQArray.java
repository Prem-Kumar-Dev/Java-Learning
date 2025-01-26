public class CircularQArray {
    static class CQ{
        int data;
        int[] arr;
        int front;
        int rare;

        public CQ(int n){
            arr = new int[n];
            front =-1;
            rare = -1;
        }

        public void enqueue(int data){
            if((rare+1)%arr.length==front){
                System.out.println("Overflow!");
                return;
            }
            if(front==-1 && rare ==-1){
                front=rare=0;
            }else{
                rare=(rare+1)%arr.length;
            }
            arr[rare]=data;
            System.out.println("Pushed: "+data);

        }
        public int dequeue(){
            if(front==-1){
                System.out.println("Underflow!");
                return -1;
            }
            int x = arr[front];
            arr[front]=-1;
            if(front==rare){
                front=rare=-1;
            }else{
                front=(front+1)%arr.length;
            }
            return x;
        }

    }

    public static void main(String[] args) {
        CQ cq = new CQ(5);
        cq.enqueue(1);
        cq.enqueue(2);
        cq.enqueue(3);
        cq.enqueue(4);
        cq.enqueue(5);
        cq.enqueue(6);
        System.out.println(cq.dequeue());
        System.out.println(cq.dequeue());
        System.out.println(cq.dequeue());
        System.out.println(cq.dequeue());
        System.out.println(cq.dequeue());
        System.out.println(cq.dequeue());

    }
}