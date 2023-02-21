package AlgorithmAndDataStructures;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        String inputString = ArrayUtils.readFileExceptions("/Users/arturchik/Desktop/Рандомні числа.txt");

        if(inputString.trim().isEmpty()) {
            System.out.println("Файл не знайдено.");
            return;
        }

        int[] inputArray = ArrayUtils.convertInputToArray(inputString);

        selectionSort(inputArray);

        System.out.println("Відсортований массив: \n" + Arrays.toString(inputArray));

    }

    // Sort array using selection sort algorithm
    public static void selectionSort(int[] inputArray) {

        long startTime = System.currentTimeMillis();

        for(int i = 0; i < inputArray.length - 1; i++) {
            int minIndex = i;
            for(int j = i + 1; j < inputArray.length; j++) {
                if(inputArray[j] < inputArray[minIndex]) {
                    minIndex = j;
                }
                ArrayUtils.swap(inputArray, minIndex, i);
            }
        }
        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;

        System.out.println("Час сортування Вибіркою: " + timeElapsed + " мс");
    }

}
