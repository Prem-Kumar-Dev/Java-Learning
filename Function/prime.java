import java.util.Scanner;
import java.lang.*;


public class prime{
    public static boolean prime(int n){
        for (int i = 2; i<=Math.sqrt(n); i++){
            if (n%i==0){
                return false;
            }
        }
        return  true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(prime(n));
    }
}