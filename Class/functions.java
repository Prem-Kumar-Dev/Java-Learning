import java.util.Scanner;

public class functions {

    public static void New(int[] n){
        for (int i = 0; i < n.length; i++){
            System.out.print(n[i] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[]={10,10,20,30};

        New(arr);
    }
}