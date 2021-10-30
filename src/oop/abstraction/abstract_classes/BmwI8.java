package oop.abstraction.abstract_classes;

public class BmwI8 extends BmwCar {

    @Override
    public void attachLogo() {
        System.out.println("Attaching BMW logo");
    }

    @Override
    public void turnOnAngelLights() {
        System.out.println("Turning on Angel Lights");
    }

    @Override
    public void run() {
        System.out.println("Running 90 km/h.");
    }

    @Override
    public void fillTheTank(String fuel) {
        System.out.println("Filling the tanks with 5l fuel.");
        System.out.println("Fuel is: " + fuel);
    }

    @Override
    public void start() {
        System.out.println("Starting the engine in BMW i8 class");
    }
}
