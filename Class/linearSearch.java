import java.util.Scanner;
public class linearSearch {

    public static int[] arrInput(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements:");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();

        }
        return arr;
    }
    public static void linearSearch(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements to search:");
        int target = sc.nextInt();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                System.out.println("Element found at index: " + i);
            }
        }

    }
    public static void largest(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }

        }
        System.out.println("The largest element is: " + max);
        System.out.println("The smalelst element is: " + min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        arrInput(arr);
        linearSearch(arr);
        largest(arr);
    }
}