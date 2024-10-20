public class LL {

    //Node creation for link list
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    //creation of head and tail obj
    public static Node head;
    public static Node tail;
    public static int size;
    //addtion of node at start-head

    public void addFirst(int data){
        //1) Step = Create new
        Node newNode = new Node(data);
        size++;
        if (head == null){
            head = tail = newNode;
            return;
        }
        //2) Step = newNode next = head
        newNode.next = head;

        //3) now assign the head to neNode
        head = newNode;
    }

    //addtion of node at last-tail
    public void addLast(int data){
        // 1) Create a newNode
        Node newNode = new Node(data);
        size++;
        if (head == null){
            head=tail = newNode;
            return;
        }
        // 2) newNode.next = tail
        tail.next= newNode;

        //3) assign tail to new node
        tail = newNode;
    }

    //addition in middle of ll

    public void addMiddle (int index,int data){
        //creating new node
        if (index == 0){
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i =0;
        if (head == null){
            head =tail= newNode;
        }
        //treversding to 1 previous index
        while (i<index-1){
            temp = temp.next;
            i++;
        }
        //adding link of the next valu which will come after newNode
        newNode.next = temp.next;
        //adding link to the previous of newNode whos next will pit toward the newNode
        temp.next=newNode;

    }

    public void removeFirst(){
        if (size == 0){
            System.out.println("List is empty");
        }
        else if (size == 1){
            size = 0;
            head = tail = null;
        }

        head = head.next;
        size--;


    }
    public void removeLast(){
        if (size == 0){
            System.out.println("List is empty");
        }else if (size == 1){
            size = 0;
            tail = head = null;
        }
        int i=1;
        Node temp= head;

        //going to previous of tail
        while (i<size-1){
            temp = temp.next;
            i++;
        }
        //assigning previous next ot null
        temp.next=null;
        //assigning previous as tail
        tail=temp;
        size--;

    }

    /*public static int sizeLL(){
        Node temp = head;
        int size = 0;
        while (temp != null){
            temp = temp.next;
            size++;

        }
        return size;
    }*/

    public static int search_Iterative_Linear(int key){
        Node temp = head;
        int i=0;
        while (temp != null){
            if (temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
        /*for(int i=0; i<size;i++){
            if (temp.data == key){
                return i;
            }
            temp = temp.next;
        }
        return -1;*/
    }
    public int helper(Node head, int key){
        if (head == null){
            return -1;
        }
        if (head.data==key){
            return 0;
        }
        int idx=helper(head.next,key);
        if (idx==-1){
            return -1;
        }

        return idx+1;
    }
    public int search_Recursive_Linear(int key){
        return helper(head,key);

    }

    public void reverseLL(){
        Node prev = null;
        Node current = tail = head; //->head is asigned to tail an then tail(head) is assigned to current
        Node next;
        while (current != null){
            //assigning next node
            next = current.next;
            //reversing current node
            current.next = prev;
            //chaniing pre -> next or moving pointer by one
            prev = current;
            //changing next-> curr
            current = next;
        }
        head = prev; //-> b/c after everything the curr or head becomes null so we store pev value to head
    }

    public void remove_nth_fromLast(int index){
        if (index == 1){
            removeLast();
            return;
        }
        if (index == size){
            removeFirst();
            return;
        }

        int i=1;
        Node temp = head;
        while (i<size-index){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;


    }
    //Slow-Fast approch
    public Node findMid(){
        Node slow = head;
        Node fast = head;
        int mid = 0;
        while( fast!=null && fast.next!=null){
            fast=fast.next.next;//+2
            slow=slow.next;//+1
        }
        return slow;
    }
    public boolean isPelindrome_LL(){
        if (head==null || head.next==null){
            return true;
        }
        //step1 - find mid
        Node midNode = findMid();
        //step2 - reverse 2nd half
        //entire block of code is for reversing
        Node prev=null;
        Node curr=midNode;
        Node next;
        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right = prev; //reiht half head since curr becomes null the prev is holding the last/first node.
        Node left = head;

        //step3 - checj 1st and 2nd half
        while (right !=null){ //left!=null is not necc b/c the right become null first.(has less node to triverse)
            if (left.data!= right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;


    }
    public boolean detectLoop(){        //Floyd's Cycle Finding
        Node slow = head;
        Node fast = head;

        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (fast==slow){
                return true; //cycle detected
            }
        }
        return false;  //no cycle detected
    }

    public void removeLoop(){
        boolean loop=false;
        Node slow = head;
        Node fast = head;

        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (fast==slow){
                loop=true;//cycle detected
                break;
            }
        }

        if (loop==true){
            slow = head;
            Node prev=null;

            while (fast!=slow){
                slow=slow.next;
                prev=fast;
                fast=fast.next;
            }
            prev.next=null;

        }


    }
    public void zigzag(){
        Node slow = head;
        Node fast = head;

        //finding mid node
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        Node curr = slow.next;
        slow.next=null;
        fast.next=null;

        //reversing second half
        Node next;
        Node prev=null;

        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;
        Node nextL,nextR;



        while(right!=null && right!=null){
            /*temp=right.next;
            right.next=left.next;
            left.next=right;
            left=right.next;
            right=temp;*/

            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            left=nextL;
            right=nextR;
        }




    }
    public static void printLL(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+">");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        LL ll = new LL();
        /*ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addMiddle(0,100);
        ll.removeFirst();
        ll.removeLast();
        printLL();
        System.out.println("Iteration:"+ll.search_Iterative_Linear(4));
        System.out.println("Recurssion:"+ll.search_Recursive_Linear(4));
        ll.reverseLL();
        ll.addFirst(5);
        ll.addFirst(6);
        ll.addFirst(7);
        ll.addFirst(8);
        printLL();
        ll.remove_nth_fromLast(3);
        printLL();
        System.out.println(ll.findMid());

        System.out.println(size);*/
        /*ll.addFirst(3);
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(5);
        ll.addFirst(1);
        ll.addFirst(3);
        printLL();
        System.out.println(ll.isPelindrome_LL());*/


        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        /*head.next.next.next.next.next=head.next.next;
        System.out.println(ll.detectLoop());
        ll.removeLoop();
        System.out.println(ll.detectLoop());
*/
        printLL();
        ll.zigzag();
        printLL();
    }
}



