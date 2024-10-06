import java.util.*;

public class life {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name= sc.nextLine();

        Name s1=new Name(name);
        s1.goal();

    }
}

class Name {
    String name;

    Name(String name) {
        this.name = name;
    }

    void goal() {
        if (this.name.equals("Swastik") || this.name.equals("swastik")) {
            System.out.println("Apka Kat chuka hai!");
        } else if (this.name.equals("Aditya") || this.name.equals("aditya")) {
            System.out.println("|                      |");
        } else if (this.name.equals("Prathameash") || this.name.equals("prathamesh")) {
            System.out.println("6 cm that's it!");

        } else if (this.name.equals("Gaurav") || this.name.equals("gaurav")) {
            System.out.println("Class 8 me dhokha:");

        }else {
            System.out.println("Invalid name!");
        }
    }
}

