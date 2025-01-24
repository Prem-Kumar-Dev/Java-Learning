public class SparceArray {
    public static void main(String[] args) {
        int[][] arr = {{0,0,1,2},
                        {0,2,0,0},
                        {8,0,0,0},
                        {0,0,9,0}};
        int column=0;
        //Getting the no of columns required
        for(int i = 0; i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                if(arr[i][j]!=0){
                    column++;
                }
            }
        }
        //creating the matrix required to store sparce matrix {3*column}
        int[][] sArr = new int[3][column];

        //storing the values in sparce array
        int k=0;
        for(int i =0; i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]!=0){
                    sArr[0][k]=i;
                    sArr[1][k]=j;
                    sArr[2][k]=arr[i][j];
                    k++;
                }
            }
        }
        //printing
        for(int i = 0;i<sArr.length;i++){
            for(int j = 0;j<sArr[0].length;j++){
                System.out.print(sArr[i][j]);
            }

            System.out.println();
        }
    }
}