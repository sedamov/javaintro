package classwork.lesson8;

public class CounterExample {

    public static void main(String[] args) {
        //We can use static methods without objects
        StaticCounter.printCount();

        //We have only one reference
        StaticCounter counter;
        for (int i = 0; i < 10; i++) {
            //We create multiple instance with 'new' operator and StaticCounter constructor
            counter = new StaticCounter();
            System.out.println("Random generated number: " + counter.randomNumber);
            //Note that I'm using class name to call the method
            StaticCounter.printCount();
        }

        System.out.println("Number of generated objects: " + StaticCounter.count);
    }
}
