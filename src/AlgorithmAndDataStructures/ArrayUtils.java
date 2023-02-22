package AlgorithmAndDataStructures;

/**
 * The ArrayUtils class provides utility methods for working with arrays
 */
public class ArrayUtils {

    /**
     * Method to converting input string to integer array
     * @param input String to be converted
     * @return array of integer
     */
    public static int[] convertInputToArray(String input) {

        String[] stringArray = input.split(" ");
        int[] integerArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            integerArray[i] = Integer.parseInt(stringArray[i]);
        }
        return integerArray;
    }

    /**
     * Method to swaps two elements in an array.
     * @param arr Array to swap elements
     * @param index1 Element in array
     * @param index2 Element in array
     */
    public static void swap(int[] arr, int index1, int index2) {

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
