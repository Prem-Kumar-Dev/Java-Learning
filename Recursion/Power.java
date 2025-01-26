public class Power {
    static int pow(int x, int n){
        if(n==1){
            return x;
        }
        return x* pow(x,n-1);
    }
    static int oppow(int x, int n){
        if(n==1){
            return x;
        }
        if(x%2==0){
            return oppow(x,(n)/2) * oppow(x,(n)/2);
        }else{
            return x * oppow(x,(n-1)/2) * oppow(x,(n-1)/2);
        }
    }
    public static void main(String[] args) {
        System.out.println(oppow(2,4));
    }
}