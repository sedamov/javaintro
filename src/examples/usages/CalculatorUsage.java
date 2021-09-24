package examples.usages;

import examples.classes.Calculator;

/**
 * In this class we have examples of creating the object from Calculator class and calling its methods.
 */
public class CalculatorUsage {

    public static void main(String[] args) {
        /*
        Creating a calculator object, and providing 'basic' as a type.
        someRefName is used to show that reference name can be anything.
        Preferable name will be basicCalculator, because it is more descriptive
        */
        Calculator someRefName = new Calculator("basic");


        //This line prints the value of someRefName reference which is the address
        //
        /*
        The output will be like this: examples.classes.Calculator@3d24753a
        the first part (until @ symbol) describes the type of reference, in our case it is Calculator which is in package examples.classes
        the second part (after @ symbol) provides the address from heap where the object was created
        */
        System.out.println("The address of above-created object is : " + someRefName);


        System.out.println("The type of calculator is: " + someRefName.type);
        System.out.println("Calling sum method from Calculator");
        long sum = someRefName.sum(3, 8);
        System.out.println("Result of the sum method is: " + sum);


        /*
        Here I am also creating a calculator object, this time using the default constructor
        and setting the value of 'type' field after creation.
         */
        Calculator scientificCalc = new Calculator();
        scientificCalc.type = "scientific";

        System.out.println("The address of above-created object is : " + scientificCalc);

        System.out.println("The type of calculator is: " + scientificCalc.type);

        System.out.println("Calling diff method from Calculator");
        int diff = scientificCalc.diff(20, 38);
        System.out.println("Result of the diff method is: " + diff);

        System.out.println("Calling divide method from Calculator");
        double div0 = scientificCalc.divide(45, 0);
        System.out.println("Result of the div method is: " + div0);



        System.out.println("Calling divide method from Calculator again");
        double div = scientificCalc.divide(45, 5);
        System.out.println("Result of the div method is: " + div);

    }
}
