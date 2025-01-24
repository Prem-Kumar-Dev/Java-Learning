public class SelectionSort {

    public static int[] Selection(int[] arr){
        for(int i =0;i<arr.length-1;i++){
        int minPos = i;
            for(int j = i; j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos = j;
                }
            }
            if(minPos!=i){
                int temp = arr[minPos];
                arr[minPos]=arr[i];
                arr[i]=temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,5,2,3};
        arr = Selection(arr);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}