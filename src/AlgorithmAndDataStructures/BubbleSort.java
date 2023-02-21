package AlgorithmAndDataStructures;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        String inputString = ArrayUtils.readFileExceptions("/Users/arturchik/Desktop/Рандомні числа.txt");

        if(inputString.trim().isEmpty()) {
            System.out.println("Файл не знайдено.");
            return;
        }

        int[] inputArray = ArrayUtils.convertInputToArray(inputString);

        bubbleSort(inputArray);

        System.out.println("Відсортований массив: \n" + Arrays.toString(inputArray));
    }

    // Sort array using bubble sort algorithm
    public static void bubbleSort(int[] inputArray) {

        long startTime = System.currentTimeMillis();

        for(int i = 0; i < inputArray.length - 1; i++) {
            for (int j = 0; j < (inputArray.length - i - 1); j++) {
                if (inputArray[j] > inputArray[j + 1]) {
                    ArrayUtils.swap(inputArray, j, j + 1);
                }
            }
        }
        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;

        System.out.println("Час сортування Бульбашкою: " + timeElapsed + " мс");
    }

}
