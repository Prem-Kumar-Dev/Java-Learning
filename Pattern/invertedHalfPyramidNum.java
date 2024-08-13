import java.util.Scanner;

public class invertedHalfPyramidNum {
    public static void patten(int n) {
         for (int i=0;i<n;i++){
             for (int j=1;j<=n-i;j++){
                 System.out.print(j);
             }
             System.out.println();
         }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        patten(num);
    }
}