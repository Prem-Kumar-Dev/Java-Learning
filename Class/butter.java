import java.util.*;

public class butter  {

    public static void pattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (i<=((n/2))){
                    if((i+j)<=2*i || ((i+j)>n)){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }

                }else{
                    if ((i+j)<=(n+1)||(i+j)>=(2*i)){
                        System.out.print("* ");

                    }else{
                        System.out.print("  ");
                    }
                }

            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Rows:_");
        int n = sc.nextInt();
        pattern(n);
        butterfly(n);

    }
}