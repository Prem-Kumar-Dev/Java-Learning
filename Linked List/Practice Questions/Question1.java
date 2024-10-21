public class Question1 {

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head1;
    public static Node head2;

    public static void printLL(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }

    public Node intersection(){
        Node temp1=head1;
        Node temp2=head2;

        while(temp1!=null){
            while(temp2!=null){
                if (temp2==temp1){
                    return temp1;
                }
                temp2=temp2.next;
            }
            temp2=head2;
            temp1=temp1.next;
        }
        return null;
    }

    public static void main(String[] args) {
        Question1 ll = new Question1();

         Node a= new Node(1);
         Node b= new Node(2);
         Node c= new Node(3);
         Node d= new Node(6);
         Node e= new Node(7);
         Node f= new Node(4);
         Node g= new Node(5);

         head1=a;
         head2=f;

         a.next=b;
         b.next=c;
         c.next=d;
         d.next=e;
         e.next=null;
         f.next=g;
         g.next=d;

         printLL(head1);
         printLL(head2);

         Node intersect=ll.intersection();
         System.out.println(intersect.data);
    }
}