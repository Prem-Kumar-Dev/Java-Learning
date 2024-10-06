
public class fibo {
    public static void fibonacci(int n){
        int a=1;
        int b=1;
        int c;
        System.out.println(a);
        for(int i=1;i<n;i++){
            System.out.println(b);
            c=a;
            a=b;
            b=c+b;
        }
    }
    /*public static int fibonacciReccursion(int n){

        if (n<=1) {
            return 1;
        }
        return fibonacciReccursion(n-1)+fibonacciReccursion(n-2);
    }*/

    public static void fibonachiReccursion(int a, int b, int n){


        if (n==0) {
            return;
        }
        int next=a+b;
        System.out.println(next);
        fibonachiReccursion(b, next, n-1);


    }

    public static void main(String[] args) {
        System.out.println("Using Iteration");
        fibonacci(5);
        System.out.println("Using Recursion");
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        fibonachiReccursion(a,b,5-2);
        }
    }
