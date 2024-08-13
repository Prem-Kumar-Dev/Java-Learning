import java.util.Scanner;

public class fullpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character:_");
        char ch = sc.next().charAt(0);
        System.out.print("Enter the no. of lines:_");
        int lines = sc.nextInt();
        sc.close();

        for(int i=0; i<lines;i++){
            for(int j=i; j<lines; j++){
                System.out.print(" ");

            }
            for(int k=0; k<((2*i)+1); k++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}