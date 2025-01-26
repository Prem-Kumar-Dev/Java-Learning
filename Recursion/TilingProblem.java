public class TilingProblem {
    static int tile(int n){

        if(n==0 || n==1){
            return 1;
        }
        //verical placement
        int wayV = tile(n-1);
        int wayH = tile(n-2);
        //horizontal placement
        return wayH+wayV;
    }

    public static void main(String[] args) {
        System.out.println(tile(4));
    }
}