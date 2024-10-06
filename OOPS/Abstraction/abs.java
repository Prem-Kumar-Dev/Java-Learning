public class abs{

    public static void printOb(Chicken a){
        System.out.println(a.color);
        System.out.println(a.eat(););
    }


    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        Chicken c =new Chicken();
        c.eat();
        c.walk();

        /*Animal a =new Animal() {
            @java.lang.Override
            void walk() {
                System.out.println("hello");
            }
        };
        a.walk();*/

    }
}
abstract class Animal{ //abstract class
    String color;
    Animal(){
        color="Brown";
    }
    void eat(){
        System.out.println("eat");
    }
    abstract void walk();    //abstract methods

}

class Horse extends Animal{
    void walk(){
        System.out.println("walk on four legs");
    }
    void changeColor(){
        this.color="Dark Blue";
    }
}

class Chicken extends Animal{

    void walk(){
        System.out.println("walk on two legs");
    }
    void changeColor(){
        this.color="White";
    }
}