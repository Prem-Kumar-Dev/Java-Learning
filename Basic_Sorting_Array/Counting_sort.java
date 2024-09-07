public class Counting_sort{


    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,6,8,4,5,8,7,8,1,2};
        int range=Integer.MIN_VALUE;


        for (int i = 0; i < arr.length; i++) {
            range=Math.max(range, arr[i]);
        }
        int arr2[]=new int[range+1];
        for (int i = 0; i < arr.length; i++){
            arr2[arr[i]]=arr2[arr[i]]+1;
        }
        int j=0;
        for (int i = 0; i < arr2.length; i++){
            while(arr2[i]>0){
                arr[j]=i;
                j++;
                arr2[i]--;
            }
        }
        printArray(arr2);
        printArray(arr);
    }

}