// Java - selection sort algorithm - static array, no toString method

package Sorting;

public class Selection {
    public static void arraySort(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            int index = i;
            for(int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }
            int lowerNum = array[index];
            array[index] = array[i];
            array[i] = lowerNum;
        }
    }
    
    public static void main(String[] args) {

        int[] array = {15,3,10,6,5,18,7,11};
        int arrayLength = array.length;

        System.out.println("Array before sort:");
        for(int i = 0; i < arrayLength; i++) {
            System.out.println(array[i]);
        }

        arraySort(array);

        System.out.println("Array after sort:");
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}