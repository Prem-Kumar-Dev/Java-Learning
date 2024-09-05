import java.util.Scanner;

public class methodOverloading {

    public static int multiply(int a, int b) {
        return a * b;
    }
    public static float multiply(float a, float b) {
        return a * b;
    }
    public static double multiply(double a, double b) {
        return a * b;
    }
    public static int multiply(int a,int b,int c) {
        return a * b * c;
    }


    public static void main(String[] args) {
        System.out.println(multiply(22.223, 3.22));
        System.out.println(multiply(2223, 3,22));


    }
}