//delete m numbers of node after n node;

import java.util.Scanner;

public class Question2 {

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode= new Node(data);
        if (head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
        return;

    }

    public static void printLL(){
        if (head==null){
            System.out.println("Empty LL!");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }


    public void removeMfromN(int m, int n){
        Node temp=head;


        while(temp!=null) {
            //treversing to n number node:
            int count=1;
            while (count != n && temp!=null) {
                if(temp==null){
                    return;
                }

                temp = temp.next;
                count++;
            }
            if (temp==null){
                return;
            }
            count = 0;
            //same as removal from mid but added counter;
            while (count != m && temp!=null) {
                if (temp == head) {
                    head = head.next;
                } else{
                    temp.next = temp.next.next;
                }
                count++;


            }
            temp=temp.next;
        }
        }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter value of M:");
        int m = sc.nextInt();

        System.out.println("Enter value of N:");
        int n = sc.nextInt();

        Question2 ll = new Question2();
        ll.addFirst(10);
        ll.addFirst(9);
        ll.addFirst(8);
        ll.addFirst(7);
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        printLL();
        ll.removeMfromN(m,n);
        printLL();





    }
}