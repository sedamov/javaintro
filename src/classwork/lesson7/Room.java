package classwork.lesson7;

public class Room {
    int height;
    int length;
    int width;

    public Room() {}

    public Room(int height, int length, int width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    long calculateVolume(int length, int height, int width) {
        return length * height * width;
    }

    void printFields(Room room) {
        System.out.println("Dining Room: height - " + room.height);
        System.out.println("Dining Room: length - " + room.length);
        System.out.println("Dining Room: width - " + room.width);
    }


}
