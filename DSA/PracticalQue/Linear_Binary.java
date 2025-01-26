public class Linear_Binary {
    public static int linerSearch(int[] arr,int key) {
        if(arr == null || arr.length == 0){
            return -1;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] arr,int key){
        if(arr == null || arr.length == 0){
            return -1;
        }
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == key){
                return mid;
            }
        }
        return -1;
    }0
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6,7,8,9};
        System.out.println(linerSearch(A, 9));
        System.out.println(linerSearch(A, 8));
    }
}