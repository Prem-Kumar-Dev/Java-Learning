import java.util.Scanner;

public class input_output {
    public static void main(String[] args) {
        int marks[]=new int[100];
        Scanner sc = new Scanner(System.in);

        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        System.out.println(marks[0]+ " "+marks[1]);
        marks[0]=5;
        System.out.println(marks[0]+ " "+marks[1]);
        System.out.println("Length:_"+marks.length);
    }
}