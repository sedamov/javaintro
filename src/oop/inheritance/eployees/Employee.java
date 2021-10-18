package oop.inheritance.eployees;

/**
 * This class describes employees in general
 * This is a Base class
 */
public class Employee {

    public Employee() {
        System.out.println("Employee Constructor is called");
    }

    public void work() {
        System.out.println("Working");
    }

    public void raise() {
        System.out.println("Raising");
    }
    public void getPaid() {
        System.out.println("Salary is Paid");
    }

    public boolean isExperienced() {
        return true;
    }

    public int yearsOfExperience() {
        return 1;
    }
}
