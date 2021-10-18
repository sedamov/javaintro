package oop.inheritance.animals;

public class Frog implements WaterAnimalInterface, LandAnimalInterface {

    @Override
    public void moveOnTheLand() {
        System.out.println("Jumping on the land");
    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public void swim() {
        System.out.println("Swimming in the lake");
    }
}
