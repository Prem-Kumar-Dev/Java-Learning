public class BinaryString {

    static void printB(int n,int last,String str){
        if(n==0){
            System.out.println(str);
            return;
        }

        printB(n-1,0,str+"0");
        if(last==0){
            printB(n-1,1,str+"1");
        }

    }
    public static void main(String[] args) {
        printB(3,0,"");
    }
}