package oop.polymorphism;

public class Dog extends Animal {

    //Dynamic polymorphism example
    @Override
    public void voice() {
        super.voice();
        System.out.println("Wuf");
    }
}
