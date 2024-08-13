import java.util.Scanner;

public class pelindrome {
    public static void pelindrom(int n) {
        for(int i=1;i<=n;i++){
            for (int j=i;j<n;j++){
                System.out.print(" ");

            }
            for (int k=1;k<=i;k++){
                System.out.print(k);
            }
            for (int l=i;l>1;l--){
                System.out.print(l-1);
            }
            System.out.println();
        }
    }
    public static void pelindrom2(int n) {
        for(int i=1;i<=n;i++){
            for (int j=i;j<n;j++){
                System.out.print(" ");
            }

            for (int j=i;j>1;j--){
                System.out.print(j);
            }


            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int n = sc.nextInt();
        pelindrom(n);
        pelindrom2(n);

        }
    }
