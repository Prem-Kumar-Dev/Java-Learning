public class Encapsulation {
    public static void main(String[] args) {

    }
}

class Student{
    String name;
    int age;

    void setName(String name){
        this.name = name;

    }
    void setAge(int age){
        this.age = age;

    }

    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
}