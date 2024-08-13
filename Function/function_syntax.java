import java.util.Scanner;

public class function_syntax {
    public static int hello(){
        System.out.println("hello");
        return 1;
    }

    public static float sum(float x, float y){
        return x+y;
    }

    public static float product(float x,float y){
        return x*y;
    }

    public static int factorial(int x){
        int fact=1;
        for(int i=1;i<=x;i++){
            fact*=i;
        }
        return fact;
    }

    public static int binomial(int n, int r){
        n=factorial(n);
        r=factorial(r);
        int k=factorial((n-r));
        return (n/(r*(k)));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number1:_");
        float x=sc.nextFloat();

        System.out.println("Enter number2:_");
        float y=sc.nextFloat();

        hello();
        System.out.println(sum(x, y));
        System.out.println(product(x, y));

        System.out.println("Enter number:_");
        int f=sc.nextInt();
        System.out.println(factorial(f));


        System.out.println("Enter number n:_");
        int n=sc.nextInt();
        System.out.println("Enter number r:_");
        int r=sc.nextInt();
        System.out.println(binomial(n,r));



    }
}