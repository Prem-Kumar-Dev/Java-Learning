

public class arrfunction {
    public static void update(int marks[], int nonChangable){
        nonChangable=10;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int mark[]={10,20,30};
        int nonChangable=50;
        update(mark,nonChangable);
        for(int i=0;i<mark.length;i++){
            System.out.print(mark[i]+" ");

        }
        System.out.println(nonChangable);
    }
}