package classwork.lesson2;


import org.w3c.dom.ls.LSOutput;

public class Lesson2 {

    public static void main(String[] args) {
        int a = 20;
        int b = 8;
        int c = 13;

        if (a > b) {
            if (a > c) {
                System.out.println(a);
            }
        }  else if (b > c) {
                System.out.println(b);
            }
            else System.out.println(c);

            int d = (a < b) ? ((a > 0) ? a : 0) : b;
        System.out.println(d);
        System.out.println("Finish");

        int month = 1;

        switch (month) {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
            case 12:
                System.out.println("It is winter");
                break;
        }
        System.out.println("It is not winter");

        }

}
