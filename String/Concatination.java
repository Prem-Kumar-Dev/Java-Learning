import java.util.Scanner;
public class Concatination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fname: ");
        String fname = sc.nextLine();
        System.out.print("Enter lname: ");
        String lname = sc.nextLine();

        String fullName = fname + " " + lname;   //concatination
        System.out.println(fullName);

    }
}