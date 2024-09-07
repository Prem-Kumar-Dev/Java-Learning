public class Insertion_sort{

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={10,15,32,6,5,88,5};

        for (int i = 1; i < arr.length; i++) {
            int curr=arr[i];
            int pre=i-1;
            //correct position
            while(pre>=0 && curr<arr[pre]){
                arr[pre+1]=arr[pre];
                pre--;
            }
            //instertion
            arr[pre+1]=curr;

        }
        printArray(arr);
    }
}