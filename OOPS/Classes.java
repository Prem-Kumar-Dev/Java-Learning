public class Classes{
    public static void main(String[] args){
        Pen p1 = new Pen();
        p1.setColor("Red");
        System.out.println(p1.color);
        p1.color="yellow";
        System.out.println(p1.color);


    }
}

class Pen{
    String color;
    int tip;

    void setColor(String newcolor){
        color = newcolor;
    }
    void setTip(int newtip){
        tip=newtip;
    }

}
class Student {
    String name;
    int age;
    float percentage;

    void setPercentage(float per){
        percentage=per;
    }
}