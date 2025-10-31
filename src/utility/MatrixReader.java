package utility;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatrixReader {
    public static List<List<Integer>> readNumberFromFile(String filename) {
        // Create a 2D list to store the matrix
        List<List<Integer>> numbers = new ArrayList<>();

        Path filePath = Path.of(filename);

        try (Scanner scanner = new Scanner(filePath)) {
            // Handle empty file situation
            if (!scanner.hasNextLine()) {
                System.err.println("File empty!");
                throw new IOException("Empty file!");
            }

            System.out.println("Reading: " + filename);

            int rowCount = 0;
            int colCount = 0;

            String firstLine = scanner.nextLine();

            // Use a separate Scanner just for the first line
            try (Scanner lineScanner = new Scanner(firstLine)) {
                if (lineScanner.hasNextInt()) {
                    rowCount = lineScanner.nextInt();
                }
                if (lineScanner.hasNextInt()) {
                    colCount = lineScanner.nextInt();
                }
            }

            System.out.println("Input Matrix Dimension -> Row:" + rowCount + " Col:" + colCount);

            for (int i = 0; i < rowCount; i++) {
                if (scanner.hasNextLine()) {
                    String line = scanner.nextLine();

                    // Check if there are any empty lines in the input file
                    if (line.isEmpty() || line.isBlank() || line == null) {
                        System.out.println("Line is empty!");
                        throw new IOException("Empty line!");
                    }

                    String[] nums = line.trim().split("\\s+");

                    if (nums.length != colCount) {
                        System.out.println("There are more numbers than column count!");
                        throw new IOException("Incorrect number of data!");
                    }

                    // Create a temporary list for the current row
                    List<Integer> currentRow = new ArrayList<>(colCount);

                    for (int j = 0; j < colCount; j++) {
                        currentRow.add(Integer.parseInt(nums[j]));
                    }

                    numbers.add(currentRow);
                }

            }

        } catch (IOException e) {
            System.err.println("Error while reading file: " + filename + " - Error: " + e.getMessage());
        }

        return numbers;
    }
}
