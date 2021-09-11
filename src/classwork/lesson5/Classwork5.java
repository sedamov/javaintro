package classwork.lesson5;

public class Classwork5 {

    public static void main(String[] args) {
//        long arrName[] = new long[3];
//        arrName[0] = 1;
//        for (int i = 0; i < arrName.length; i++) {
//            System.out.println(arrName[i]);
//        }
//        for (long elem: arrName) {
//            System.out.println(elem);
//        }

        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println((int) (Math.random() * 10));
        }

        int max = array[0];

        for (int elem: array) {
//            System.out.println("Array element " + elem);
            if (max < elem) {
                max = elem;
            }
        }

        System.out.println(max);

        int newArray[] = {2, 5, 78, 98, 22, 2, 100, 672};

        int array1[] = new int[8];
        array1[0] = 2;

        int matrix[][] = new int[2][];

        matrix[0] = new int[1];
        matrix[0][0] = 3;
        matrix[1] = new int[2];
        matrix[1][0] = 4;
        matrix[1][1] = 5;




    }
}
