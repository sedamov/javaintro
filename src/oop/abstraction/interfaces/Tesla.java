package oop.abstraction.interfaces;

public class Tesla implements ElectricCar {

    @Override
    public void run() {
        System.out.println("Running automatically");
    }

    @Override
    public void fillTheTank(String fuel) {
        System.out.println("The fuel is electrical.");
        System.out.println("Charging the car");
    }

    @Override
    public void start() {
        System.out.println("Starting the car with the application");
    }

    @Override
    public void emitCO2() {
        System.out.println("Eco friendly car, no emissions.");
    }
}
