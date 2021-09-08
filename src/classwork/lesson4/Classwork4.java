package classwork.lesson4;

public class Classwork4 {

    public static void main(String[] args) {

        int a = 11;
        while (a <= 0) {
            if (a % 2 == 0) {
                System.out.println(a);
                a -= 2;
            } else {
                a--;
            }
        }

        do {
            if (a % 2 == 0) {
                System.out.println(a);
            } else {
                System.out.println(a);
            }
            a--;
        } while (a <=0);

        System.out.println(a);

        for (a = 0; a <= 10; a++) {
            if (a % 2 == 0) {
                System.out.println("skipping : " + a);
            }
            System.out.println(a);
        }
        System.out.println("After for");

        for (int b = 0; b <= 10; b++) {
            if (b % 2 == 1) {
                System.out.println("Skipping : " + b);
                continue;
            }
            System.out.println("Printing : " + b);
        }
    }
}
