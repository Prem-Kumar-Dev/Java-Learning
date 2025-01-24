public class TOH {
    public static void tower(int n,char source,char destination,char helper){
        if(n==1){
            System.out.println("Move disk 1 from "+source+" to "+destination);
            return;
        }
        tower(n-1,source,helper,destination);
        System.out.println("Move disk "+n+" from "+source+" to "+destination);
        tower(n-1,helper,destination,source);
    }

    public static void main(String[] args) {
        tower(3,'A','C','B');
    }
}