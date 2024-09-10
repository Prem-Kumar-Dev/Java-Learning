public class Palindrome {
    public static void main(String[] args) {
        String str=("madam");
        for(int i=(str.length()/2)-1;i>=0;i--){
            if (str.charAt(i)!=str.charAt(str.length()-1-i)){
                System.out.println("Not a palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}