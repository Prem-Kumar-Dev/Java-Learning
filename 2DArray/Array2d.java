import java.util.Scanner;

public class Array2d{

        public static void printArray(int[][] arr) {
                for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                                System.out.print(arr[i][j] + " ");
                        }
                        System.out.println();
                }
        }

        public static boolean Search(int[][] arr, int target) {
                for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                                if (arr[i][j] == target) {
                                        System.out.println(arr[i][j] + "found at index " + i + "," + j);
                                        return true;
                                }
                        }
                }
                System.out.println("NOT FOUND");
                return false;
        }


        public static int[][] inputArr(int[][] arr) {
                Scanner sc = new Scanner(System.in);

                for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[0].length; j++) {
                                arr[i][j] = sc.nextInt();
                        }
                }
                return arr;

        }

        public static void main(String[] args) {
                int arr[][]=new int[4][4];
                arr=inputArr(arr);
                printArray(arr);
                Search(arr,5);
        }
}