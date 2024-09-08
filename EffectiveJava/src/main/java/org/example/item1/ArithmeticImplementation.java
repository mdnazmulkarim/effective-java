package org.example.item1;

//example from https://stackoverflow.com/questions/512877/why-cant-i-define-a-static-method-in-a-java-interface
public class ArithmeticImplementation implements Arithmetic {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = Arithmetic.multiply(2, 3);
        System.out.println(result);
    }
}
