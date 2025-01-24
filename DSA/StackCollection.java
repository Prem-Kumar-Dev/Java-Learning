import java.util.LinkedList;

public class StackCollection {
    private LinkedList<Integer> stack = new LinkedList<>();

    public void push(int value) {
        stack.addFirst(value);
    }

    public int pop() {
        if (isEmpty()){
            return -1;
        }else{
            return stack.removeFirst();
        }
    }

    public int peek() {
        if (isEmpty()){
            return -1;
        }else{
            return stack.getFirst();
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void display() {
        if (isEmpty()){
            System.out.println("Stack Empty!");
        }else{
            System.out.println("Stack elements: " + stack);
        }
    }

    private int error(String message) {
        System.out.println(message);
        return -1;
    }

    public static void main(String[] args) {
        StackCollection stack = new StackCollection();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.pop();
        System.out.println(stack.peek());
        stack.display();
    }
}
