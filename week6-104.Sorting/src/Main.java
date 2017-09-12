
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        int[] values = {6, 5, 8, 7, 11};
//        System.out.println("smallest: " + smallest(values));
//        System.out.println("Index of the smallest: " + indexOfTheSmallest(values));
//        int[] values = {-1, 6, 9, 8, 12};
//        System.out.println(indexOfTheSmallestStartingFrom(values, 1));
//        System.out.println(indexOfTheSmallestStartingFrom(values, 2));
//        System.out.println(indexOfTheSmallestStartingFrom(values, 4));
//        int[] values = {3, 2, 5, 4, 8};
//
//        System.out.println(Arrays.toString(values));
//
//        swap(values, 1, 0);
//        System.out.println(Arrays.toString(values));
//
//        swap(values, 0, 3);
//        System.out.println(Arrays.toString(values));
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] table) {
        int smallest = table[0];
        for (int number : table) {
            if (number < smallest) {
                smallest = number;
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] table) {
        int smallest = smallest(table);
        int theIndexOfSmallest = 0;
        for (int i = 0; i < table.length; i++) {
            if (table[i] == smallest) {
                theIndexOfSmallest = i;
                break;
            }
        }
        return theIndexOfSmallest;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallest = array[index];
        int r = index;
        for (int i = index; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                r = i;
            }
        }
//        System.out.println("index of the smallest " + r);
        return r;

    }

    public static void swap(int[] array, int index1, int index2) {
        int helper = array[index1];
        array[index1] = array[index2];
        array[index2] = helper;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            swap(array,i,indexOfTheSmallestStartingFrom(array, i));
        }
    }

}
