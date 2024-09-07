public class Diagonal_sum {
    public static void main(String[] args) {
        /*int arr[][]={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };*/
        int arr[][] ={{1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int i=0; int i_sum=0;
        int j=0; int j_sum=0;
        int jmax=arr[0].length-1;

        while (i<arr.length){
            i_sum+=arr[i][j];
            j_sum+=arr[i][jmax];
            i+=1;
            j+=1;
            jmax-=1;

        }
        if (arr.length%2!=0){
            int diff=(arr.length/2);
            j_sum=j_sum-arr[diff][diff];
        }
        System.out.println("The Sum of Diagonals is: "+(i_sum+j_sum));



    }
}
