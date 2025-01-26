public class StackArray {
    static class Stack{
        int data;
        int top;
        int[] arr;
        public Stack(int n){
            top = -1;
            arr = new int[n];
        }
        public void push(int x){
            if(top < arr.length-1){
                top++;
                arr[top] = x;
                return;
            }
            System.out.println("Stack overflow");
        }
        public int pop(){
            if(top == -1){
                System.out.println("Stack underflow");
            }else{
                int x = arr[top];
                arr[top]=0;
                top--;
                return x;
            }
            return 0;
        }

    }
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());


    }
}