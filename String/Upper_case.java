public class Upper_case{
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("hi, i am prem");

        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        for (int i=1;i<sb.length();i++){

            if (sb.charAt(i)==' ' && i+1<sb.length()){
                sb.setCharAt(i+1, Character.toUpperCase(sb.charAt(i+1)));

            }

        }

        System.out.println(sb);

    }
}