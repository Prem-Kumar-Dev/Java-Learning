import java.util.Scanner;

public class whileloop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:_");
        int n=sc.nextInt();
        int sum=0;
        int count=0;

        while(count<=n){
            sum+=count;
            count++;
        }
        System.out.println(sum);
    }
}