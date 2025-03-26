public class kth_symbol {
    static int kthGrammar(int n, int k) {
        if (n == 1){
            return 0;
        }

        if (k % 2 == 1){
            if(kthGrammar(n-1,(k+1)/2))==0) {
                return 0;
            }else{
                return 1;
            }
        }
        if(kthGrammar(n-1,k/2)==0){
            return 1;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(kthGrammar(5,7));
    }
}