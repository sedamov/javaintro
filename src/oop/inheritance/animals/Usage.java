package oop.inheritance.animals;

/**
 * This class shows inheritance in action
 */
public class Usage {

    public static void main(String[] args) {
       Fish fish = new Fish();

       fish.voice();

       Cat barsik = new Cat();
       barsik.voice();
       barsik.move();
       barsik.eat();
    }
}
