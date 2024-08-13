import java.util.Scanner;

public class halfpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character:_");
        char ch = sc.next().charAt(0);
        System.out.print("Enter the no. of lines:_");
        int lines = sc.nextInt();
        sc.close();

        for(int i=1; i<=lines;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);  //change ch to j for numbers:
            }
            System.out.println();
        }
    }
}