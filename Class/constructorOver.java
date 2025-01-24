public class constructorOver {
    public static void main(String[] args) {

        Student s1=new Student("Prem",19);
        System.out.println(s1.name);

        Student s2=new Student(s1);
        System.out.println(s2.name);

    }
}

class Student{
    String name;
    int age;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    Student(Student s){
        this.name = s.name;
        this.age = s.age;
    }
}