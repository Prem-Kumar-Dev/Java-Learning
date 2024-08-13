import java.util.Scanner;

public class breakconti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:_");
        int n = sc.nextInt();
        int count=1;

        while(true){
            System.out.println(count+". Hello World!");
            if(count==n){
                if (count==5){
                    System.out.println(count+". Goodbye!");
                    count+=1;
                    continue;
                }
                break;
            }
            count=count+1;

        }
    }
}