public class method_overloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum(1,2,3));
        System.out.println(calc.sum(1,22.5));
    }
}

class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    double sum(double a, double b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}