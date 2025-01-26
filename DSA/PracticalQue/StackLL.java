public class StackLL {
    static class StackNode{
        int data;
        StackNode next;
        public StackNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static StackNode head;

    public void push(int data){
        StackNode snode = new StackNode(data);
        if(head==null){
            head=snode;
            return;
        }
        snode.next=head;
        head=snode;
        System.out.println("Pushed: "+head.data);

    }
    public int pop(){
        if(head==null){
            System.out.println("Stack Underflow!");
            return -1000000;
        }
        int x = head.data;
        head=head.next;
        return x;
    }
    public int peek(){
        return head.data;
    }

    public static void main(String[] args) {
        StackLL sll = new StackLL();
        System.out.println(sll.pop());
        sll.push(1);
        sll.push(2);
        sll.push(3);
        sll.push(5);
        System.out.println(sll.pop());
        System.out.println(sll.pop());
        System.out.println(sll.peek());
    }
}