import java.util.Scanner;

public class pyramid {

    public static void half(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }

    }

    public static void full(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (2*i)+1; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        half(n);
        full(n);
    }
}