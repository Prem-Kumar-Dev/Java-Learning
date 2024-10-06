public class tstrest {
    public static void main(String[] args) {
        String a="Aman";
        String b="Aditya";
        String[] arr={"Aman","Aditya"};
        System.out.println(a.compareTo(b));
        System.out.println(a.charAt(0)>b.charAt(1));
        System.out.println(arr[0].charAt(0)>arr[1].charAt(1));
        System.out.println(arr[1].length());
//        int k= arr[i].lenght()>=arr[i+1].length() ? arr[i+1].lenght():arr[i].length();
//        System.out.println(k);
        int i=0;
        int n;
        if (arr[i].length() > arr[i+1].length()) {
            n=arr[i+1].length()-1;

        }else{
            n=arr[i].length()-1;
        }

        for (int j1=0;j1<n;j1++) {
            if(arr[i].charAt(n) > arr[i+1].charAt(n)){
                n=j1;
                break;
            }
        }
        System.out.println(n);


    }
}