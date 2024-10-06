public class inheritance {
    public static void main(String[] args) {
        Cat c1= new Cat("Black","Mew");
        System.out.println(c1.color);
        System.out.println(c1.sound);

        Bulldog b1= new Bulldog("Black", "Woof");
        System.out.println(b1.color);
        System.out.println(b1.sound);

        Alaskan_Malamute a1= new Alaskan_Malamute("Brown", "Woof");
        System.out.println(a1.color);
        System.out.println(a1.sound);


    }
}


class Animal{
}

class Dog extends Animal{
    String color;
    String sound;

    Dog(String color, String sound){
        this.color = color;
        this.sound = sound;
    }

}

class Cat extends Animal{
    String color;
    String sound;

    Cat(String color, String sound){
        this.color = color;
        this.sound = sound;
    }
}

class Bulldog extends Dog{
    Bulldog(String color, String sound){
        super(color, sound);
        System.out.println("Bulldog are the worst!");
    }
}

class Alaskan_Malamute extends Dog{
    Alaskan_Malamute(String color, String sound){
        super(color, sound);
        System.out.println("Alaskan Malamute are the best!");
    }
}




