public class Selection_sort {



    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={10,2,3,68,4,6};
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
        printArray(arr);
    }
}