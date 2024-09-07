public class Search_2d {
    public static void main(String[] args) {
        int arr[][]={{10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}};

        int target = 29;
        int i_min=0,i_max=arr.length-1;
        int j_min=0,j_max=arr[0].length-1;

        if (arr[i_min][j_min]>target || arr[i_max][j_max]<target){
            System.out.println("Not Found");
            return;
        }

        for(int i=i_min; i<=i_max; i++){
            if (arr[i][j_min]<=target && arr[i][j_max]>=target){
                if(i==i_max || arr[i+1][j_min]>=target){
                    i_min=i;
                    break;
                }

            }
        }
        for (int j=j_min; j<=j_max; j++){
             if (arr[i_min][j]==target){
                System.out.println("Found at: "+i_min+" "+j);
                return;
            }


        }
        System.out.println("Not Found");


    }
}