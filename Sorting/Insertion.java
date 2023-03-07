// Java - Insertion Sort - Static array, no toString method

package Sorting;

public class Insertion {

    public static void arraySort(int[] array) {

        int n = array.length;

        for(int  i = 0; i < n; i++) {
            int temp = array[i];
            int j = i - 1;
            
            while((j >= 0) && (array[j] > temp)) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = temp;
        }
    }

    public static void main(String[] args) {

        int[] array = {11,5,1,7,4,9,3};
        int arrayLength = array.length;

        System.out.println("Array before sorting");
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