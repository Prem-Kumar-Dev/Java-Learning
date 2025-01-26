public class LastOccurance {

    static int last(int[] arr, int i, int key){
        if(i==-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return last(arr,i-1,key);
    }

    public static void main(String[] args) {
        int[] arr = {1,8,1,6,9,2,5,0};
        System.out.println(last(arr,arr.length-1,5));
    }
}