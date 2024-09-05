import java.util.*;

public class ifcon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        if (a.equals("1")){
            System.out.println("Entered 1");
        }else if(a.equals("2")) {
            System.out.println("Entered 2");

        }else if(a=="") {
            System.out.println("Entered null");
        }else{
            System.out.println("Not found");
        }


    }
}