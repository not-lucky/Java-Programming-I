import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
                // write your test code here

        int[] numbers = {8, 7, 6, 5, 4, 3, 2, 1};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array){
        // write your code here
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallestIndex = 0;
        int smallest = MainProgram.smallest(array);
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest) {
                smallestIndex = i;
                break;
            }
        }

        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here
        int smallest = table[startIndex];
        int smallestIndex = startIndex;

        for (int i = smallestIndex; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                smallestIndex = i;
            }
        }

        return smallestIndex; 
    }

    public static void swap(int[] array, int index1, int index2) {
        // write your code here

        int placeholder = array[index1];

        array[index1] = array[index2];
        array[index2] = placeholder;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfSmallestFrom(array, i));
            System.out.println(Arrays.toString(array));
        }
    }

}
