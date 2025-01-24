public class SparceLL {

    static Node head = null;

    public static class Node{
        int row;
        int column;
        int data;
        Node next = null;
    }
    public static void create(int row,int column, int data){
        Node newNode = new Node();
        newNode.row=row;
        newNode.column=column;
        newNode.data=data;

        if(head==null){
            head = newNode;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;

        }
    }

    public static void main(String[] args) {
        int[][] arr = {{0,0,1,2},
                {0,2,0,0},
                {8,0,0,0},
                {0,0,9,0}};

        for(int i = 0; i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]!=0){
                     create(i,j,arr[i][j]);
                }
            }
        }
        //printing
        Node t = head;
        while(t!=null){
            System.out.print("["+t.row+","+t.column+","+t.data+"]>");
            t=t.next;
        }
    }
}