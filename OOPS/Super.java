public class Super {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);

    }
}

class Animal{
    String color;
    Animal(){
        System.out.println("Constructor of Animal");
    }
}
class Horse extends Animal{
    Horse(){
        super.color ="black";
        System.out.println("Constructor of Horse");
    }
}