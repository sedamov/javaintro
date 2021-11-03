package collections;

import java.util.ArrayList;

public class ArrayListExamples {

    public static void main(String[] args) {
        String[] array = new String[10];
        array[0] = "Hello";

        System.out.println("First elem is: " + array[0]);
        System.out.println("Array is: " + array);
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("Hello");
        numbers.add("World");
        numbers.add("!");

        numbers.add(2, "Hey");
        System.out.println("First elem in ArrayList: " + numbers.get(0));
        System.out.println("ArrayList is: " + numbers);


        ArrayList<Integer> integers = new ArrayList<>(5);
        for (int i = 0; i < 10; i++) {
            integers.add((int) (Math.random() * 100));
        }
        System.out.println("Integers are: " + integers);
        ArrayList<Integer> additionalIntegers = new ArrayList<>(3);
        for (int i = 0; i < 3; i++) {
            additionalIntegers.add((int) (Math.random() * 100));
        }
        System.out.println("Additional integers: " + additionalIntegers);
        integers.addAll(3, additionalIntegers);
        System.out.println("After adding new elements: " + integers);
    }
}
