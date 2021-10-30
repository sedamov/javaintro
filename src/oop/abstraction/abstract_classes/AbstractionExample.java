package oop.abstraction.abstract_classes;

public class AbstractionExample {

    public static void main(String[] args) {
        BmwI8 abstractCarReference = new BmwI8();
        abstractCarReference.start();
        abstractCarReference.turnOnAngelLights();

        Tesla teslaRef = new Tesla();
        teslaRef.run();
        teslaRef.emitCO2();
        teslaRef.stop();
    }
}
