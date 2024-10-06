public class method_overiding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Deer  deer = new Deer();
        deer.eat();

        Heyna heyna = new Heyna();
        heyna.eat();

    }
}

class Animal{
    void eat(){
        System.out.println("Eats anything");
    }
}

class Deer  extends Animal{
    void eat(){
        System.out.println("Eats grass");
    }
}
class Heyna extends Animal{

}