import java.util.ArrayList;

public class arraylist {

    public static void main(String[] args) {
        arrayL temp = new arrayL();
        temp.start();
    }
}

class arrayL extends Thread{
    public void run(){
        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.set(0,5);
        System.out.println(arr);
    }
}
