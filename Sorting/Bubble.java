// Java - Bubble Sort Algorithm - static array, no toString method

package Sorting;

public class Bubble {

    public static void arraySort(int[] array) {
        int n = array.length;
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] array = {10,3,6,1,8,12,9};
        int arrayLength = array.length;

        System.out.println("Array before sorting:");
        for(int i = 0; i < arrayLength; i++) {
            System.out.println(array[i]);
        }

        arraySort(array);

        System.out.println("Array after sorting:");
        for(int i = 0; i < arrayLength; i++) {
            System.out.println(array[i]);
        }
    }
}