import java.util.Scanner;

public class rhombus {
    public static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){ //j=1 to n-i
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("* ");

            }
            System.out.println();
        }choco install firacode

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
}