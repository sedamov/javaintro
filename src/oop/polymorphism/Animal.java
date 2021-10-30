package oop.polymorphism;

public class Animal {

    private String name;

    public Animal() {}

    public Animal(String name) {
        this.name = name;
    }

    public void voice() {
        System.out.println("Make noises");
    }
}
