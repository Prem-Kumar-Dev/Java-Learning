public class InsertionSort {
    public static int[] Insertion(int[] arr){
        for(int i =1;i<arr.length;i++){
            int temp = arr[i];
            int j=i-1;
            while(j>=0 && temp<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {8,9,1,2,4,5,2,3};
        arr = Insertion(arr);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}