package utility;

import java.util.List;
import java.util.stream.Collectors;
import java.nio.file.Path;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;

public class MatrixWriter {

    public static void writeMatrixToFile(List<List<Integer>> matrix, String filename) {
        Path outputPath = Path.of(filename);

        try (BufferedWriter writer = Files.newBufferedWriter(outputPath)) {
            // Handle empty/missing results
            if(matrix == null || matrix.isEmpty()) {
                System.err.println("Output matrix is empty!");
                return;
            }

            int rowCount = matrix.size();
            int colCount = matrix.get(0).size();

            // First, write the dimensions of the result
            writer.write(rowCount + "\t" + colCount);
            writer.newLine();

            // Afterwards, stream the values
            for (List<Integer> row : matrix) {
                String line = row.stream().map(String::valueOf).collect(Collectors.joining("\t"));

                writer.write(line);
                writer.newLine();
            }

            System.out.println("Result matrix successfully written to: " + filename);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + filename + " - Error: " + e.getMessage());
        }
    }
    
}
