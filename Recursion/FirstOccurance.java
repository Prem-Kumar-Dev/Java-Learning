public class FirstOccurance {
    static int first(int[] arr,int i,int key){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return first(arr,i+1,key);
    }
    public static void main(String[] args) {
        int[] arr = {1,8,1,6,9,2,5,5};
        System.out.println(first(arr,0,5));
    }
}