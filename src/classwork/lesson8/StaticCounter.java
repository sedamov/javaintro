package classwork.lesson8;

public class StaticCounter {

    public static int count;
    public int randomNumber;

    public StaticCounter() {
        //Generating random numbers between 50 and 150
        randomNumber = (int) (50 + Math.random() * 100);
        //Counting the number of created instances.
        count++;
    }

    public static void printCount() {
        System.out.println("The number of created objects is: " + count);
    }
}
