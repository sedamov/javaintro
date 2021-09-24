package examples.usages;

import examples.classes.Dog;

/**
 * In this class there are examples of Dog class usage.
 */
public class DogUsage {

    public static void main(String[] args) {

        Dog bullTerrier = new Dog();
        System.out.println("The fields of Dog class have their default values.");
        /*
        null is the default value for reference types.
         */
        System.out.println("Dog breed: " + bullTerrier.breed + "\nDog age: " + bullTerrier.age +
                "\nDog has fur: " + bullTerrier.hasFur + "\nDog color: " + bullTerrier.color);

        /*
        Let's set some values
         */

        bullTerrier.breed = "Bull Terrier";
        bullTerrier.age = 5;
        bullTerrier.hasFur = true;
        bullTerrier.color = "Brown";

        /*
        Let's print the fields one more time
         */
        System.out.println("Dog breed: " + bullTerrier.breed + "\nDog age: " + bullTerrier.age +
                "\nDog has fur: " + bullTerrier.hasFur + "\nDog color: " + bullTerrier.color);

        /*
        Calling Dog's methods
         */
        bullTerrier.run();
        bullTerrier.bark();
        bullTerrier.sit();
        bullTerrier.eat();
    }
}
