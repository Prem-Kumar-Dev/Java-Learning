public class Substring {
    public static void main(String[] args) {
        String str=("Hello World");
        int start=2,end=5;
        String substr="";
        for (int i=start;i<end;i++) {
            substr +=str.charAt(i);
        }
        System.out.println(substr);

        //inbuild meth
        System.out.println(str.substring(start,end));

    }
}