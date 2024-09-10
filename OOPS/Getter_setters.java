public class Getter_setters {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setColor("Red");
        System.out.println(p1.getColor());
    }
}

class Pen{
    String color;
    int tip;

    String getColor(){              //getter
        return this.color;
    }
    void setColor(String color){    //setter
        this.color = color;
    }

}