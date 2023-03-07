// Java - Merge Sort Algorithm - Static Array, No toString Method

package Sorting;

public class Merge {

    public static void merge(int array[], int left, int middle, int right) {
        int x = middle - left + 1;
        int y = right - middle;

        int leftArray[] = new int[x];
        int rightArray[] = new int[y];

        for(int i = 0; i < x; i++) {
            leftArray[i] = array[left + i];
        }
        for(int j = 0; j < y; j++) {
            rightArray[j] = array[middle + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;

        while(i < x && j < y) {
            if(leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            }
            else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while(i < x) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while(j < y) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    void sort(int array[], int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;

            sort(array, left, middle);

            sort(array, middle + 1, right);

            merge(array, left, middle, right);
        }
    }

    public static void main(String[] args) {

        int[] array = {44,12,8,51,31,74,23,33,29};
        int n = array.length; //length = 9

        System.out.println("Array before sorting:");
        for(int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }

        Merge sortingObject = new Merge();
        sortingObject.sort(array, 0, n - 1);

        System.out.println("Array after sorting:");
        for(int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}