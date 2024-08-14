import java.util.*;
public class pair {
    public static void pairarr(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+") ");
            }
            System.out.println();
        }
    }
    public static void subarr(int[] arr){

        for(int i=0;i<arr.length-1;i++){

            for (int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        //TC ==> O(n3)
    }
    public static int maxSubarrSum(int[] arr){
        //Brute Force
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<arr.length-1;i++){

            for (int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                if (sum>maxSum){
                    maxSum = sum;
                }

            }
        }
        return maxSum;
        //TC ==> O(n3)
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,-88,10};
        subarr(arr);
        System.out.println(maxSubarrSum(arr));
    }
}