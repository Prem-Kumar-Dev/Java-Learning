public class Inheritance {
    public static void main(String[] args) {
        /*Fish shark = new Fish();
        shark.eat();
        shark.breath();
        shark.swims();*/

        Dog dog = new Dog();
        dog.eat();
        dog.breath();
        dog.legs=4;
        System.out.println(dog.legs);
    }
}

//base class
class Animal {
    String color;

    void eat(){
        System.out.println("Eat");
    }
    void breath(){
        System.out.println("Breath");
    }
}
//derived class

/*class Fish extends Animal {
    int fins;
    void swims(){
        System.out.println("Swim");
    }
}*/

class Mammal extends Animal {
    int legs;


}

class Dog extends Mammal {
    String breed;
}




