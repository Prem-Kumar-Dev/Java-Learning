public class Sorting {

    public static void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int[] Bubble_Sort(int[] arr) {
        for (int j = 0; j < arr.length-1; j++) {

            for (int i = 0; i<arr.length-1-j; i++) {

                if (arr[i] > arr[i+1]) {
                    int tmp=arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;


                }
            }
        }
        return arr;
    }

    public static int[] Selection_Sort(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {
            int minPos=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[minPos]) {
                    minPos = j;
                }

            }
            //swap values
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={1,5,3,55,14,88,25};
        printArr(arr);
        System.out.println("Sorted Array:{Bubble Sort}");
        printArr(Bubble_Sort(arr));
        System.out.println("Sorted Array:{Selection Sort}");
        printArr(Selection_Sort(arr));
    }
}