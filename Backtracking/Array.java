public class Array {
    static int[] assign(int[] arr,int i,int val){
        if(val==arr.length+1){
            return arr;
        }
        arr[i] = val;
        assign(arr,i+1,val+1);
        arr[i] =arr[i]-2;    //backtracking step;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        arr = assign(arr,0,1);
