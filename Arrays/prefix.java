import java.util.*;

public class prefix {

    public static void prefixArr(int[] arr) {

        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i-1]+arr[i];
        }
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j<arr.length; j++) {
                int currentsum = i==0 ? prefix[j] : prefix[j]-prefix[i-1];
                sum = currentsum>sum?currentsum:sum;

                }
            }
        System.out.println(sum);
        //TC ==> O(n2)
        }


    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3,8};
        prefixArr(arr);

    }
}

