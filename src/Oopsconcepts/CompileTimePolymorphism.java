package Oopsconcepts;

class MathOperations {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int h, int c) {
        return a + h + c;
    }

    public String add(String a, String h) {
        return a + h;
    }
}

public class CompileTimePolymorphism {

    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();

        // Issue 1: The 'add' method expects integers, but you are passing strings.
        // Corrected method invocations
        System.out.println("Sum of two integers: " + mathOps.add(22, 77));
        System.out.println("Sum of three integers: " + mathOps.add(22, 44, 78));

        // Issue 2: 'Hello' is not defined, it should be a string literal.
        // Corrected string concatenation
        System.out.println("Concatenation of two strings: " + mathOps.add("Hello", " World"));
    }

}

