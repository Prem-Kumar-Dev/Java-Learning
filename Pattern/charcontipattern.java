import java.util.*;

public class charcontipattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of lines:_");
        int n=sc.nextInt();
        int c=65;

        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print((char)(c));
                c++;
            }
            System.out.println();
        }

    }
}