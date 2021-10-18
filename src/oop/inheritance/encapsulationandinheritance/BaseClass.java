package oop.inheritance.encapsulationandinheritance;

public class BaseClass {

    private String type;

    String defaultAccess;

    public void callPrint() {
        print();
    }

    void printDefaultAccess() {
        System.out.println("In the same package");
    }

    private void print() {
        System.out.println("Hello from private method");
    }
}
