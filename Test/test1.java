public class test1 {


    public static void main(String[] args) {

        int low=1;
        int high=999999999;

        if (low%2!=0 || high%2!=0){
            System.out.println(((high - low) / 2) + 1);
        }else{
            System.out.println(((high-low)/2));
        }
    }
}

