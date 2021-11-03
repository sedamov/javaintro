package collections;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> stringList = new LinkedList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add(0, "First");

        System.out.println("LinkedList is: " + stringList);
    }
}
