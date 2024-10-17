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
        int i=0;
        Node temp= head;

        //going to previous of tail
        while (i<size-1-1){
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
        ll.addFirst(1);
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
        printLL();

        System.out.println(size);
    }
}



