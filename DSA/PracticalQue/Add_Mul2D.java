public class Add_Mul2D {
    public static int[][] addition(int[][] A,int[][] B){
        if(A.length != B.length || A[0].length!=B[0].length){
            return null;
        }
        int[][] C = new int[A.length][A[0].length];

        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[0].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }

    public static int[][] multiplication(int[][] A, int[][] B){

        if(A.length != B.length && A[0].length != B[0].length){
            System.out.println("Dimentios are not Compatable!");
            return null;
        }
        int[][] C = new int[A.length][B[0].length];
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < B[0].length; j++){
                for(int k = 0; k < A[0].length; k++){
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;

    }

    public static void display(int[][] A){
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[0].length; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] B = {{1,2,3},{4,5,6},{7,8,9}};

        display(addition(A,B));
        display(multiplication(A,B));
    }
}