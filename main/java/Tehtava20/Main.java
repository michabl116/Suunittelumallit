package Tehtava20;


public class Main {
    public static void main(String[] args) {
        int numberOfElements = 10;
        Sequence fibonacci = new FibonacciSequence(numberOfElements);

        System.out.println("First " + numberOfElements + " Fibonacci numbers:");
        for (Integer num : fibonacci) {
            System.out.print(num + " ");
        }
    }
}
