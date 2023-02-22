package AlgorithmAndDataStructures;
import java.util.Arrays;

/**
 * The Sort class contains an implementation of the bubble, selection and quick sorts algorithm.
 */
public class Sort {

    public static void main(String[] args) {

        // File with 100_000 random numbers
        String inputString = FileExceptions.fileIsFound("/Users/arturchik/Desktop/Рандомні числа.txt");

        if(inputString == null) {
            System.out.println("Файл не знайдено.");
            return;
        }

        int[] arrayForQuick = ArrayUtils.convertInputToArray(inputString);
        int[] arrayForBubble = ArrayUtils.convertInputToArray(inputString);
        int[] arrayForSelection = ArrayUtils.convertInputToArray(inputString);

        quickSort(arrayForQuick);
        bubbleSort(arrayForBubble);
        selectionSort(arrayForSelection);

    }

    /**
     * Method for sort array using bubble sort algorithm
     * @param intArray, the array to sort
     */
    public static void bubbleSort(int[] intArray) {

        long startTime = System.currentTimeMillis();
        int n = intArray.length;

        for(int i = 0; i < n - 1; i++) {
            for (int j = 0; j < (n - i - 1); j++) {
                if (intArray[j] > intArray[j + 1]) {
                    ArrayUtils.swap(intArray, j, j + 1);
                }
            }
        }
        long endTime = System.currentTimeMillis();

        System.out.println("Час сортування Бульбашкою: " + (endTime - startTime) + " мс \n");
//        System.out.println("Відсортований массив: \n" + Arrays.toString(intArray));
    }

    /**
     * Method to sort array using selection sort algorithm
     * @param intArray Array to sort
     */
    public static void selectionSort(int[] intArray) {

        long startTime = System.currentTimeMillis();
        int n = intArray.length;

        for(int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for(int j = i + 1; j < n; j++) {
                if(intArray[j] < intArray[minIndex]) {
                    minIndex = j;
                }
                ArrayUtils.swap(intArray, minIndex, i);
            }
        }
        long endTime = System.currentTimeMillis();

        System.out.println("Час сортування Вибіркою: " + (endTime - startTime) + " мс \n");
//        System.out.println("Відсортований массив: \n" + Arrays.toString(intArray));
    }

    /**
     * Sorts the array in ascending order using the quicksort algorithm.
     *
     * @param intArray the array to be sorted
     */
    public static void quickSort(int[] intArray) {
        long startTime = System.currentTimeMillis();

        sortArray(intArray, 0, intArray.length - 1);

        long endTime = System.currentTimeMillis();

        System.out.println("Час Швидкого сортування: " + (endTime - startTime) + " мс \n");
//        System.out.println("Відсортований массив: \n" + Arrays.toString(intArray));
    }

    private static void sortArray(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(array, left, right);
            sortArray(array, left, pivotIndex - 1);
            sortArray(array, pivotIndex + 1, right);
        }
    }

    private static int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (array[j] < pivot) {
                i++;
                ArrayUtils.swap(array, i, j);
            }
        }
        ArrayUtils.swap(array, i + 1, right);
        return i + 1;
    }
}
