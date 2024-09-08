package org.example.item1;

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
