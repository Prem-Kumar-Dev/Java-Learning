import java.util.*;
public class area {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the area of the circle: ");
        float radius =sc.nextFloat();
        float area = 3.14f * radius * radius;
        System.out.println("Area = "+area);
    }
}