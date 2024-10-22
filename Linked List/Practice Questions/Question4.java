public class Question4 {
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

    public void evenOdd(){
        Node temp=head;
        Node even=null;
        Node prev=null;
        int count=0;
        while(temp!=null){
            if (count!=0 && temp.data%2==0){
                if (even!=null){
                    prev.next=temp.next;
                    temp.next=even.next;
                    even.next=temp;
                }else{
                    prev.next=temp.next;
                    temp.next=head;
                    head=temp;
                }
            }
            if(temp.data%2!=0){
                count++;
            }else{
                even=temp;
            }
            prev=temp;
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        Question4 ll= new Question4();
//        ll.addFirst(6);
//        ll.addFirst(1);
//        ll.addFirst(4);
//        ll.addFirst(5);
//        ll.addFirst(10);
//        ll.addFirst(12);
//        ll.addFirst(8);
        ll.addFirst(7);
        ll.addFirst(5);
        ll.addFirst(3);
        ll.addFirst(1);
        printLL();
        ll.evenOdd();
        printLL();

    }
}