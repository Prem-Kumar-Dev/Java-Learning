import java.util.Scanner;

public class QueueDS{

    static class Queue{
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int Q[]=new int[n];
        int front=-1;
        int rare=-1;

        void enqueue(int x){
            if(rare==n-1){
                System.out.println("Overflow");
            }
            else if(rare==-1 && front==-1){
                rare=front=0;
                Q[rare]=x;
            }
            else{
                rare++;
                Q[rare]=x;
            }

        }
        void peek(){
            if(rare==-1){
                System.out.println("No Elements present");
            }else{
                System.out.println("Front: "+Q[front]);
                System.out.println("Rare: "+Q[rare]);
            }
        }
        void dequeue(){
            if (rare==front && front==-1){
                System.out.println("Underflow");
            } else if (rare==front) {
                System.out.println("Dequeued: "+Q[front]);
                front=rare=-1;
            }else {
                System.out.println("Dequeued: "+Q[front]);
                front++;
            }

        }
        void display(){
            System.out.println("Queue is:");
            for(int i=front;i<=rare;i++){

                System.out.print(Q[i]+">");
            }
            System.out.println("end");
        }

    }


    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(3);
        queue.dequeue();
        queue.display();
        queue.peek();


    }

}