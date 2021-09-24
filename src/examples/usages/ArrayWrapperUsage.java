package examples.usages;

import examples.classes.ArrayWrapper;

/**
 * In this class we have examples of creating the object from ArrayWrapper class and calling its methods.
 */
public class ArrayWrapperUsage {

    public static void main(String[] args) {

        int[] targetArray = new int[10];
        for (int i = 0; i < targetArray.length; i++) {
            targetArray[i] = (int) (Math.random() * 1000);
        }
        ArrayWrapper arrayWrapper = new ArrayWrapper();

        arrayWrapper.print(targetArray);
        int max = arrayWrapper.findTheMaximum(targetArray);

        System.out.println("Maximum element value in the main method : " + max);

        int min = arrayWrapper.findTheMinimum(targetArray);
        System.out.println("Minimum element value in the main method : " + min);

        int[] sortedArray = arrayWrapper.sortAsc(targetArray);
        arrayWrapper.print(sortedArray);

        /*
        Try to understand why targetArray is also modified. Will discuss during the class.
         */
        arrayWrapper.print(targetArray);
        arrayWrapper.sortDesc(targetArray);

    }
}
