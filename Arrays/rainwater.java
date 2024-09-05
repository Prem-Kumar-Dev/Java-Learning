
//import java.util.Scanner;

public class rainwater { //TC==>O(n)

    public static int RainCalc(int[] arr,int width){
        int sum=0;
        int max_left_height;
        int max_right_height;

        for (int i = 0; i < arr.length; i++){
            max_left_height = max_right_height = 0;
            //Max left height:
            for (int j=i; j>=0;j--){
                if (arr[j]>max_left_height){
                    max_left_height=arr[j];
                }

            }

            //Max right height:
            for (int j=i+1; j<arr.length; j++){
                if (arr[j]>max_right_height){
                    max_right_height=arr[j];
                }

            }
            int water = (max_left_height<max_right_height) ? max_left_height : max_right_height;
            if (water-arr[i]>=0){
                sum+=(water-arr[i])*width;

            }


        }
        return sum;
    }
//2nd Method:- Auxillary method!
    public static int trappedWater(int[] max_left,int[] max_right,int[] arr){ //TC==>O(n)
        int sum=0;
        for (int i = 0; i < max_left.length; i++){
            if (max_left[i]<max_right[i] ){
                sum=sum+max_left[i]-arr[i];
            }else{
                sum=sum+max_right[i]-arr[i];
            }
        }
        return sum;
    }


    public static int rainwater2(int[] arr,int width){
        int max_left=0;
        int max_right=0;
        int max_left_boundry[]=new int[arr.length];
        int max_right_boundry[] = new int[arr.length];

        //aux arry of max of right and left
        for (int i = 0; i < arr.length; i++){
            if (arr[i]>max_left) {
                max_left=arr[i];
            }
            max_left_boundry[i]=max_left;
        }
        for (int i = arr.length-1; i >=0; i--){
            if (arr[i]>max_right){
                max_right=arr[i];
            }
            max_right_boundry[i]=max_right;
        }
        int sum=trappedWater(max_left_boundry,max_right_boundry,arr);
        return sum;
    }

    public static void main(String[] args) {
        int arr[]= {4,2,0,6,3,2,5};
        int width=1;
//        System.out.println(RainCalc(arr,width));

        System.out.println(rainwater2(arr,width));


    }
}

