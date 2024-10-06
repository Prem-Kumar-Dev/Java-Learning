import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int[] arr, int key) {
        int count = 0;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            count++;

            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.println("No of times compared = "+count);
                return mid;
            }
            else if (arr[mid] < key) {
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        System.out.println("No of times compared= "+count);
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,9,14,20,25,33,47,50,59,62,70};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key");

        int key =sc.nextInt();

        int location=binarySearch(arr, key);
        if (location == -1) {
            System.out.println("Key not found");
        }else{
            System.out.println("Key found at location " + location);
        }


    }
}