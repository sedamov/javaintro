package examples.classes;

import java.util.Arrays;

/**
 * This class describes a wrapper class for arrays with type integer.
 * This class should have the methods that represent functionality related to the arrays.
 */
public class ArrayWrapper {

    public void print(int[] array) {
        System.out.println("Printing the elements of array.");
        //Arrays is a helper class from package java.util (like the Scanner class) for working with arrays
        System.out.println(Arrays.toString(array));
    }

    public int findTheMaximum(int[] array) {

        if (array.length == 0) {
            System.out.println("The array is empty so returning -1");
            return -1;
        }

        int max = array[0];
        for (int elem: array) {
            if (elem > max) {
                max = elem;
            }
        }
        System.out.println("The maximum element is: " + max);
        return max;
    }

    public int findTheMinimum(int[] array) {
        if (array.length == 0) {
            System.out.println("The array is empty so returning -1");
            return -1;
        }

        int min = array[0];
        for (int elem: array){
            if (elem < min) {
                min = elem;
            }
        }
        System.out.println("The minimum element is: " + min);
        return min;
    }

    /**
     * Sorts in ascending order.
     */
    public int[] sortAsc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        System.out.println("After sorting: \n" + Arrays.toString(array));
        return array;
    }

    /**
     * Sorts in descending order.
     */
    public void sortDesc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        System.out.println("After sorting: \n" + Arrays.toString(array));
    }
}
