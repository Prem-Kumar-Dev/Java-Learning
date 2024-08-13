import java.util.Scanner;
import java.lang.*;

public class primeInrange{

    public static boolean prime(int a){
        for (int i = 2; i<=Math.sqrt(a); i++){
            if (a%i==0){
                return false;
            }
        }
        return  true;
    }

    public static void range(int n){
        for (int i=2;i<=n;i++){
            if (prime(i)){
                System.out.print(i+" ");
            }

        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Range: ");
        int n = sc.nextInt();
        range(n);
    }
}