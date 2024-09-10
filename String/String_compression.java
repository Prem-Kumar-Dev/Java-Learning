public class String_compression {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("aaaabbbccdddd");
        StringBuilder sb2=new StringBuilder("");

        for (int i = 0; i < sb.length(); i++) {
            int count = 0;
            int jcount=0;
            char c= sb.charAt(i);
            sb2.append(c);

            for (int j = i; j < sb.length(); j++) {
                if (c == sb.charAt(j)) {
                    count++;
                    i=j;
                }else{
                    break;
                }

            }

            sb2.append(count);



        }
        System.out.println(sb2);
    }
}