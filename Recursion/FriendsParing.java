public class FriendsParing {

    static int pair(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int ways = pair(n-1)+(n-1)*pair(n-2);
        return ways;
    }
    public static void main(String[] args) {
        System.out.println(pair(3));
    }
}