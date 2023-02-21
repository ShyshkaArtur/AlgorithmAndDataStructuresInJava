package AlgorithmAndDataStructures;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayUtils {

    // Converting input string to integer array
    public static int[] convertInputToArray(String input) {

        String[] stringArray = input.split(" ");
        int[] integerArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            integerArray[i] = Integer.parseInt(stringArray[i]);
        }
        return integerArray;
    }

    // Swap array elements
    public static void swap(int[] numbersArray, int index1, int index2) {

        int temp = numbersArray[index1];
        numbersArray[index1] = numbersArray[index2];
        numbersArray[index2] = temp;
    }

    // Checking for file existence
    public static String readFileExceptions(String fileName) {
        String inputString = " ";
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                inputString = scanner.nextLine();
            }
            scanner.close();
            return inputString;
        } catch (FileNotFoundException e) {
            return inputString;
        }
    }
}
