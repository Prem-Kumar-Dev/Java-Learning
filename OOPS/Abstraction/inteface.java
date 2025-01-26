public class inteface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}
interface Chess{
    void moves();
}

class Queen implements Chess{
    public void moves(){
        System.out.println("Up, down, diagonal,left, right");
    }
}