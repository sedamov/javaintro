package oop.animals;

public class Zoo {

    private Animal[] zooAnimals = new Animal[50];

    public Animal[] getZooAnimals() {
        return zooAnimals;
    }

    public void setZooAnimals(Animal[] zooAnimals) {
        this.zooAnimals = zooAnimals;
    }

    public void addAnimal(int i, Animal animal) {
        if (i > 49) {
            System.out.println("Invalid index: " + i);
            return;
        }
        if (this.zooAnimals[49] == null && this.zooAnimals[i] == null) {
            this.zooAnimals[i] = animal;
        }
    }

    public void printAnimalsNames() {
        for (int i = 0; i < this.zooAnimals.length; i++) {
            if (this.zooAnimals[i] == null) {
//                System.out.println("Null values is at: " + i);
                continue;
            }
            System.out.println("Name is: " + this.zooAnimals[i].getName());
        }
    }
}
