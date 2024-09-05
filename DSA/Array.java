import java.util.Scanner;


public class Array {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] insertion(int[] arr, int val, int index) {
        if (index == arr.length - 1) {
            arr[index] = val;
        }else if (index < arr.length - 1) {
            int temp = arr[index];
            arr[index] = val;
            for (int i = index+1; i < arr.length-1; i++) {
                temp=arr[i+1];
                arr[i+1]=arr[i];

            }
        }
        printArray(arr);
        return arr;
    }
    public static int[] delete(int[] arr,int index) {
        if (index == arr.length - 1) {
            arr[index] = 0;

        }else{
            arr[index]=0;
            for (int j = index+1; j < arr.length; j++) {
                arr[j-1]=arr[j];
            }
        }
        printArray(arr);
        return arr;


    }

    public static int[] ipArray(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter an integer: ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void searchfreq(int[] arr, int target) {
        int n=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                n+=1;
                System.out.println(i+") "+arr[i]);
            }
        }
        System.out.println("Frequency= "+n);
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];


//        System.out.println("Enter the elements to search: ");
//        int target = sc.nextInt();

//        arr = ipArray(arr);
//        printArray(arr);
//        searchfreq(arr,target);
//        insertion(arr,1,2);
//        delete(arr,2);

    }
}