import java.util.Scanner;

public class dowhileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:_ ");
        int n = sc.nextInt();
        int count=1;

        do{
            System.out.println(count+". Hello World!");
            count+=1;
        }while(count<=n);
    }
}