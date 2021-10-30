package oop.polymorphism;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    //Method overloading
    public long add(long a, long b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}
