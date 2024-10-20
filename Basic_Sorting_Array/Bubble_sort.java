public class Bubble_sort {

    public static void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
         int arr[]= {10,5,2,1,65,10,2};
         for (int j = 0; j < arr.length-1; j++) {

             for (int i = 0; i<arr.length-1-j; i++) {

                 if (arr[i] > arr[i+1]) {
                     int tmp=arr[i];
                     arr[i] = arr[i+1];
                     arr[i+1] = tmp;


             }
            }
         }
         printArr(arr);
    }
}{1,2,3,4,5}