public class BubbleSort {

    public static int[] bubble(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr= {1,5,4,2,3,8};
        arr = bubble(arr);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}