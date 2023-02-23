package AlgorithmAndDataStructures;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * A class that provides a method to check if a file exists and reads its contents.
 */
public class FileExceptions {

    /**
     * Reads a file with the given name and returns its contents as a string.
     * @param fileName the name of the file to read
     * @return a string containing the contents of the file, or an empty string if the file does not exist
     */
    public static String fileIsFound(String fileName) {
        try(Scanner scanner = new Scanner(new File(fileName))) {
            StringBuilder inputStringBuilder = new StringBuilder();
            while (scanner.hasNextLine()) {
                inputStringBuilder.append(scanner.nextLine());
            }
            return inputStringBuilder.toString();
        } catch (FileNotFoundException e) {
            return null;
        }
    }
}
