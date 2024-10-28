public class Arrays {
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int[][] arr){
        int[][] t = new int[arr.length][arr[0].length];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                t[i][j] = arr[j][i];
            }
        }
        return t;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        arr = transpose(arr);
        printArray(arr);

    }

    /*public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        printArray(arr);
    }*/

   /* public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Element is at index: "+linearSearch(arr, 10));

    }*/
    /*public static void min_max(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("min: " + min + " max: " + max);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        min_max(arr);
    }*/
}