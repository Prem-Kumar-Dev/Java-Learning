public class InsertionSort {
    public static int[] insertionSort(int[] arr){

        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;


        }
        return arr;
    }
    public static void diaplay(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,10,6,4,5,6,7,8,9};
        diaplay(insertionSort(arr));


    }
}