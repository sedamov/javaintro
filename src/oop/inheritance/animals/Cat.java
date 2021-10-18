package oop.inheritance.animals;

import javax.sound.midi.Soundbank;

/**
 * Describes cats and extends Animal class
 */
public class Cat extends Animal {

    @Override
    public void voice() {
        System.out.println("Meow");
    }

    public void move() {
        System.out.println("Run");
    }

    public void eat() {
        System.out.println("Eat a mouse");
    }
}
