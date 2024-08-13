package Variable_and_Data_Type.practice;

import java.util.*;

public class que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;
        float total_inc_gst = total + (total * (18f / 100f));

        System.out.println(total_inc_gst);
    }
}
