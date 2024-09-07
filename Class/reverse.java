import java.util.Scanner;

public class reverse{
    public static int reverse(int n){

        int rev=0;
        while(n!=0){
            int temp = n%10;
            rev=rev*10+temp;
            n = n/10;
        }
        return rev;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        System.out.println(reverse(n));
    }
}/;