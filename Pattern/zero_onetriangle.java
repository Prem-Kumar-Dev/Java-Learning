import java.util.Scanner;

public class zero_onetriangle {
    public static void pattern(int n) {
        boolean isTrue = true;
        for (int i = 1; i <= n; i++) {
            if (i%2!=0) {
                isTrue=false;
            }
            for (int j = 1; j <= i; j++) {
                if (isTrue==true){
                    System.out.print("0 ");
                    isTrue=false;
                }else{
                    System.out.print("1 ");
                    isTrue=true;
                }



            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i+j)%2==0) {
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        pattern2(n);

    }
}