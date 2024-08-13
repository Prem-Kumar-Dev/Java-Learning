import java.util.Scanner;
import java.lang.Math;

public class binary_decimal{

    public static float bintodecimal(int a){
        int number=0;
        int pow=0;
        while(a>0){
            int rem=a%10;
            a=a/10;
            number+=(rem*(int)Math.pow(2,pow));
            pow+=1;
        }
        return number;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(bintodecimal(a));

    }
}