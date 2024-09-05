import java.util.*;
public class stock {

    public static void printarray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        int buyPrice = Integer.MAX_VALUE;
        int sellPrice[]=arr.clone();

        int max_profit=0;

        for (int i=1;i<arr.length;i++){
            if (buyPrice < sellPrice[i]){
                int profit = sellPrice[i]-buyPrice;
                max_profit=Math.max(max_profit,profit);
            }else{
                buyPrice=sellPrice[i];
            }

        }
        System.out.println(max_profit);
}
}