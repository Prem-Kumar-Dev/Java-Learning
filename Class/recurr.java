import java.util.Scanner;

public class recurr {

    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);

    }

    public static int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for factorial:_");
        int fact = sc.nextInt();
        System.out.println("Enter the no. for sum:_");
        int sum = sc.nextInt();
        System.out.println("Factorial of "+fact+" = "+factorial(fact));
        System.out.println("Sum of "+sum+" natual numbers = "+sum(sum));



    }
}