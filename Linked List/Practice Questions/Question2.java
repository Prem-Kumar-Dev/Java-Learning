//delete m numbers of node after n node;


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

    public void removeMfromN(int m,int n){
        //treverse to the nth node;
        Node N = head;
        Node M = head;

        while(M!=null && N.next!=null) {


            for (int i = 1; i <= n - 1; i++) {
                N = N.next;
                int p=i;
            }

            if (N==null){
                break;
            }

            M = N.next; //node to be removed
            //checking if m no of node exist after n to remove;
            Node temp = N;
            for (int k=1;k<=m && temp.next!=null;k++){
                temp=temp.next;
            }
            //removing m number of nodes
            for (int j = 1; j <= m && M!=null; j++) {


                    N.next = M.next;
                    M = M.next;
                    int p=j;


            }
            if(N.next!=null){
                N=N.next;
            }
        }
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




    public static void main(String[] args) {



        Question2 ll = new Question2();
        ll.addFirst(13);
        ll.addFirst(12);
        ll.addFirst(11);
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
        ll.removeMfromN(2,2);
        printLL();





    }
}