package oop.animals;

import java.util.spi.AbstractResourceBundleProvider;

public class ZooExample {

    public static void main(String[] args) {
        Animal cat = new Animal("Pet", 3, "male",
                true, true);
        Animal dog = new Animal("Bobik", 5, "female",
                false, true);
        Zoo petZoo = new Zoo();
        petZoo.addAnimal(0, cat);
        petZoo.addAnimal(3, dog);
        petZoo.printAnimalsNames();

        //This is a bad way, because we are replacing existing animals.
        Animal[] newZooAnimals = new Animal[50];
        Animal bear = new Animal("Misha", 2, "male", true, false);
        newZooAnimals[0] = bear;

        petZoo.setZooAnimals(newZooAnimals);
        petZoo.printAnimalsNames();
    }
}
