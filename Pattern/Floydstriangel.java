import java.util.Scanner;
public class Floydstriangel {

    public static void pattern(int n) {
        int counter=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(counter);
                counter+=1;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:_");
        int n = sc.nextInt();
        pattern(n);
    }
}