public class Copy_Constructor {
    public static void main(String[] args) {
        Student s1=new Student("prem",19,"abcd");
        s1.marks[0]=100;
        s1.marks[1]=200;
        s1.marks[2]=300;

        Student s2=new Student(s1);
        s2.password="defg";
        System.out.println(s2.getName());

        s1.marks[0]=200;  //valus will still be changed since athe array is not copied inste dthe reference is copied.
        s1.marks[1]=300;
        s1.marks[2]=400;

        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }

    }
}

class Student{
    String name;
    int age;
    String password;
    int marks[];

    Student(String name, int age, String password){
        this.name = name;
        this.age = age;
        this.password = password;
        marks = new int[3];
    }
    //copy constructor
    //shallow copy construcotor
//    Student(Student s){
//        this.name = s.name;
//        this.age = s.age;
//        marks = new int[3];
//        this.marks = s.marks;
//    }
    //deept copy constructor

    Student(Student s){
        this.name = s.name;
        this.age = s.age;
        this.password = s.password;
        marks = new int[3];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = s.marks[i];

        }
    }

    String getPassword(){
        return password;

    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
}