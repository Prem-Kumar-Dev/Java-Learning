public class Constructors {
    public static void main(String[] args) {
        Student s1= new Student("Prem",19);
        Student s2= new Student(18);
    }
}

class Student{
    String name;
    int age;

    Student(){
        //non paramitarised constructor
    }

    Student(String name, int age){    //constructor
        System.out.println("constructor is colled");
        this.name = name;
        this.age = age;

    }
    Student(int age){
        System.out.println("constructor2 is colled");
        this.age = age;
    }
}