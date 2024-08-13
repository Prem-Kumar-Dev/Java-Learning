import java.util.*;
public class forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a=sc.next().charAt(0);
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=0;j<i;j++){
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
