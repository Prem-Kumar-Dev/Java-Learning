import java.util.*;


public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int fac=0;
        for(int i=2; i<=Math.sqrt(n);i++){ //optimised for large numbers:
            if (n%i==0){
                fac+=1;
            }
        }
        if(fac==0){
            System.out.println(n+" is a Prime number");
        }else{
            System.out.println(n+" is Not a Prime number");
        }
    }
}