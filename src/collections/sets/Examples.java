package collections.sets;

import collections.sets.models.Address;
import collections.sets.models.Person;

import java.util.HashSet;

public class Examples {

    public static void main(String[] args) {
        Address dummyAddr = new Address();
        Person avet = new Person("Avet", "Khachatryan", (byte) 29,
                "male", "Fast and Furious", "Armen Movsisyan",
                dummyAddr, dummyAddr);
        Person vahan = new Person("Vahan", "Khachatryan", (byte) 29,
                "male", "Fast and Furious", "Armen Movsisyan",
                dummyAddr, dummyAddr);

        System.out.println(avet.equals(vahan));

        HashSet<Person> personSet = new HashSet<>();
        personSet.add(avet);
        personSet.add(vahan);

        System.out.println("Set content: " + personSet);

    }
}
