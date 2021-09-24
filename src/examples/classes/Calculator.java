package examples.classes;

/**
 * This class describes Calculator.
 * Calculators have the functionality to perform arithmetic operations.
 *
 * We can describe a calculator by its type: basic (contains only arithmetic operations),
 * scientific (contains basic + logarithmic, power, square root, factorials etc.) and
 * programmatic (contains converters between numeric systems (binary, hexadecimal, octal etc. ))
 */
public class Calculator {

    public String type;

    //Default constructor which will create an empty object
    public Calculator() {}


    //constructor for Calculator class which will create an object
    public Calculator(String type) {
        //ignore 'this' for now
        this.type = type;
    }

    public long sum(int a, int b) {
        System.out.println("Adding numbers : " + a + " and " + b);
        return a + b;
    }

    public int diff(int a, int b) {
        System.out.println("Subtracting numbers : " + a + " and " + b);
        return a - b;
    }

    public long multiply(int a, int b) {
        System.out.println("Multiplying numbers : " + a + " and " + b);
        return (long) a * b;
    }

    public double divide(int a, int b) {
        System.out.println("Dividing numbers : " + a + " and " + b);
        if (b == 0) {
            System.out.println("Cannot divide on 0");
            return 0.0;
        }

        return (double) a / b;
    }

}
