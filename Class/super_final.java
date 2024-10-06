public class super_final{



    public static void main(String[] args) {

        Dog d=new Dog("White");
        System.out.println(d.color);

        Cat c = new Cat("Black");
        System.out.println(c.color);

        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal{
    String color="Brown";

    Animal(String color){
        this.color=color;
    }

}
class Dog extends Animal{
    Dog(String color){
        super(color);
        this.color=color;
    }
}

class Cat extends Animal{
    Cat(String color){
        super(color);
        this.color=color;
    }
}
class Horse extends Animal{
    final String color="Red";
    Horse(){
        super("Red");
    }


}

