package Polymorphism;

class SumCalculator{
    int sum(int a, int b){
        return a+b;
    }
    double sum(int a, double b){
        return a+b; // implicit type casting
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        SumCalculator s = new SumCalculator();
        int a=10, b=20, c=30;
        double d = 20.0;
        String h = "Hello", w="World";

        System.out.println("This is an example of compile time polymorphism or static polymorphism or early binding");
        System.out.println("Since in method overloading the attaching of implementation to the method name happens during compilation, it is called early binding\n");


        System.out.println("Sum of two integer numbers is " + s.sum(a,b));
        System.out.println("Sum of one integer & other double number is " + s.sum(a,d));
        System.out.println("Sum of three integer numbers is " + s.sum(a,b,c));

        System.out.println("\n\"+\" mathematically adds two integers - " + (a+b));
        System.out.println("\"+\" also concatenates two Strings - " +(h+w) );

    }
}
