package oop.abstraction.interfaces;

public class InterfacesExample {

    public static void main(String[] args) {
        Car carRef = new BmwI8();
        carRef.run();

        BmwCar bmwCarRef = new BmwI8();
        bmwCarRef.turnOnAngelLights();

        BmwI8 bmwI8Ref = new BmwI8();
        bmwI8Ref.fillTheTank("Benzine");

        ElectricCar electricCarRef = new BmwI8();
        electricCarRef.emitCO2();

        ElectricCar electricCar = new Tesla();
        electricCar.emitCO2();

        Tesla teslaRef = new Tesla();
        teslaRef.fillTheTank("Electricity");


    }
}
