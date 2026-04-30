package Algorithms.Recursion.MultipleRecursion;

public class FibonacciEasy {
    static int fibonacci(int n){
//        System.out.print(n+", ");
        if(n<=2) return 1;

        return fibonacci(n-2) + fibonacci(n-1);
        //first fibonacci(n-2) completes then fibonacci(n-1) happens;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(8));
    }
}
