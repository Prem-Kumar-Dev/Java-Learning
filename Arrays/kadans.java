import java.util.Scanner;

public class kadans {

    public static void algo(int[] arr){
        int ms= Integer.MIN_VALUE;
        int cs =0;
        for (int i = 0; i < arr.length; i++){
            cs = cs+arr[i]>=0 ? cs+arr[i] : 0;
            ms = cs>ms ? cs:ms;

        }
        System.out.println(ms);
        //TC ==>O(n)


    }
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        algo(arr);
    }
}