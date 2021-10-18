package oop.inheritance.eployees;

/**
 * This class describes Software Engineers and extends Employee
 */
public class SoftwareEngineer extends Employee {

    public SoftwareEngineer() {
        System.out.println("SoftwareEngineer constructor is called");
    }
    public void writeCode() {
        System.out.println("Drink coffee and write code");
    }

    @Override
    public void raise() {
        System.out.println("Raise salary");
    }
}
