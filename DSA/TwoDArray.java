import java.util.Scanner;

public class TwoDArray {
    public static int[][] twoDArray(int[][] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static void printTwoDArray(int[][] arr) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] addTwoDArray(int[][] arr1, int[][] arr2) {
        int sum[][]=new int[arr1.length][arr1[0].length];
        System.out.println("Sum:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        return sum;
    }

    public static int[][] subTwoDArray(int[][] arr1, int[][] arr2) {
        int sub[][]=new int[arr1.length][arr1[0].length];
        System.out.println("Difference:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                sub[i][j]=arr2[i][j]-arr1[i][j];
            }
        }
        return sub;
    }


    public static int[][] mulTwoDArray(int[][] A, int[][] B) {
        int[][] C = new int[A.length][A[0].length];
        System.out.println("Multiplication:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }

        }
        return C;
    }




    public static void main(String[] args) {
        int arr1[][]=new int[3][3];
        int arr2[][]=new int[3][3];
        int result[][]=new int[3][3];
        arr1=twoDArray(arr1);
        arr2=twoDArray(arr2);

        printTwoDArray(arr1);
        printTwoDArray(arr2);

        result=addTwoDArray(arr1,arr2);
        printTwoDArray(result);

        result=subTwoDArray(arr1,arr2);
        printTwoDArray(result);

        result=mulTwoDArray(arr1,arr2);
        printTwoDArray(result);

    }
}


