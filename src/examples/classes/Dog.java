package examples.classes;

/**
 * This class describes dog model.
 * In order to describe dogs we need to define its characteristics such as: breed, age, has fur or not, color
 * The dog can eat, bark, run, sit
 */
public class Dog {

    public String breed;
    /*
    Dogs live at most 20-25 years so there is no need to use bigger type
     */
    public byte age;
    public boolean hasFur;
    public String color;

    /*
    I am intentionally not providing any constructor so that the default will be generated for me.
     */

    public void bark() {
        System.out.println("The dog is barking");
    }

    public void run() {
        System.out.println("The dog is running");
    }

    public void eat() {
        System.out.println("The dog is eating");
    }

    public void sit() {
        System.out.println("The dog is sitting");
    }

}
