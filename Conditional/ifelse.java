import java.util.*;

public class ifelse{
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a>=18){
            System.out.println("yes");
        }
        else if (a<10){
            System.out.println("What are you doing here!");
        }
        else{
            System.out.println("no");
        }*/
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        float tax;
        if (income<500000){
            tax=0;
        }
        else if (income>=500000 && income<=1000000){
            tax=income*(0.2f);
        }
        else {
            tax=income*(0.3f);
        }
        System.out.println("Tax: Rs."+tax);
    }

}