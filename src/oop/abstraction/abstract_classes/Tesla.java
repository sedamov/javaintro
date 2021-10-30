package oop.abstraction.abstract_classes;

public final class Tesla extends ElectricCar {

    @Override
    public void run() {
        System.out.println("Running the Tesla");
    }

    @Override
    public void fillTheTank(String fuel) {
        System.out.println("Charging the car with electricity");
        System.out.println("Fuel should be electric: " + fuel);
    }

    @Override
    public void start() {
        System.out.println("Starting the car");
    }

    @Override
    public void emitCO2() {
        System.out.println("Eco-friendly car, no emissions!");
    }

    public final void stop() {
        System.out.println("Stopping the car");
    }
}
