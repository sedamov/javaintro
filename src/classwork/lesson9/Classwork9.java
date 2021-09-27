package classwork.lesson9;

public class Classwork9 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        printArray(array, 3);

        long factorial = factorialOf(3);
        System.out.println("Factorial is: " + factorial);
        long sum = sum(23);
        System.out.println("Resulting sum is: " + sum);
    }

    public static long factorialOf(int number) {
        System.out.println("Number is: " + number);
        //Exit statement
        if (number == 1) return 1;
        //Calculating factorial.
        return factorialOf(number - 1) * number;
    }

    public static long sum(int number) {
        System.out.println("Number is: " + number);
        //Exit statement
        if (number == 1) return 1;
        //Calculating factorial.
        long sum = sum(number - 1) + number;
        System.out.println("Current sum is: " + sum);
        return sum;
    }

    public static void printArray(int[] array, int i) {
        System.out.println("Current Index is: " + i);
        if (i < 0) return;
        printArray(array, i - 1);
        System.out.println("array[" + i + "] = " + array[i]);
    }
}
