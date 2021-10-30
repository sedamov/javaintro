package oop.abstraction.interfaces;

/**
 * The BMW i8 car is a hybrid car
 * that's why it should implement 2 interface
 */
public class BmwI8 implements BmwCar, ElectricCar {

    @Override
    public void attachLogo() {
        System.out.println("Attaching BMW logo");
    }

    @Override
    public void turnOnAngelLights() {
        System.out.println("Turning on the Angel Lights");
    }

    @Override
    public void run() {
        System.out.println("Running the car at 90 m/h");
    }

    @Override
    public void fillTheTank(String fuel) {
        System.out.println("Filling the tank with fuel");
        System.out.println("Fuel is: " + fuel);
    }

    @Override
    public void start() {
        System.out.println("Starting the car");
    }

    @Override
    public void emitCO2() {
        System.out.println("There is some amount of emission.");
    }
}
