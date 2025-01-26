public class Static {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.setName("Prem");
        s1.school = "NEW";
        System.out.println(s1.school);
        Student s2 = new Student();
        s2.school = "OLD";
        System.out.println(s2.school);
    }
}

class Student{
    String name;
    int roll;

    static String school;

    void setName(String name){
        this.name=name;
    }

    String getName(){
        return this.name;
    }
}