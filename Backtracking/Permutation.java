public class Permutation {
    static void find(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            String New = str.substring(0,i)+ str.substring(i+1);
            find(New,ans+curr);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        find(str,"");

    }
}