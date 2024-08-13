package Operator;
import java.util.*;

public class unary{
    public static void main(String[] args) {
        //INCREMENT
        int a=5;
        int b=a++; // Post-INCREMENT
        System.out.println(b);
        int c=a;
        System.out.println(c);

        int d=++a; //Pre-INCREMENT
        System.out.println(d);

        //DECREMENT
        int e=5;
        int f=e--; //Post-DECREMENT
        System.out.println(f);
        int g=e;
        System.out.println(g);

        int h=--e; //Pre-DECREMENT
        System.out.println(h);



    }
}