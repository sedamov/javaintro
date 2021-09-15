package classwork.lesson7;

public class Main {

    public static void main(String[] args) {
        Room diningRoom = new Room();
        System.out.println("Dining Room: height - " + diningRoom.height);
        diningRoom.height = 5;
        diningRoom.printFields(diningRoom);

        Room bedroom = new Room();
        diningRoom.printFields(bedroom);
        bedroom.calculateVolume(5, 5, 5);

        System.out.println("Volume is: " + bedroom.calculateVolume(5, 5, 5));
    }
}
