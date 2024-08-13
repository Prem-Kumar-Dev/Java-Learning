import java.util.*;

public class input{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.next(); //single word
        sc.nextLine();
        String l = sc.nextLine(); //whole line
        int m = sc.nextInt(); // integer
        float o = sc.nextFloat(); //float
        System.out.println(n+m+l+o);
        System.out.println(m);
    }
}