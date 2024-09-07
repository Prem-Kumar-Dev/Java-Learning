import java.util.Arrays;


public class Inbuilt_Sort {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={10,25,3,25,655,1,5};

//        Arrays.sort(arr);
        Arrays.sort(arr,0,4);
        printArray(arr);
    }


}