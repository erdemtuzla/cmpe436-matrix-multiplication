import java.util.ArrayList;
import java.util.List;

import utility.*;

public class Main {
    public static void main(String[] args) {
        // Student information
        System.out.println("-----------------------------------------");
        System.out.println("| CMPE436 Assignment-3 HW1-Q1 \t\t| \n| Erdem Tuzla - 2024700114\t\t|\n| erdem.tuzla@std.bogazici.edu.tr\t|");
        System.out.println("-----------------------------------------");

        // Create 2D arrays for storing matrices
        List<List<Integer>> matrix1 = new ArrayList<>();
        List<List<Integer>> matrix2 = new ArrayList<>();

        if (args.length != 3) {
            System.err.println("Incorrect number of input arguments. Please provide as:\ninputMatrix1 inputMatrix2 outputMatrix");
            return;
        }

        // Read input files
        // Read Matrix-1
        matrix1 = MatrixReader.readNumberFromFile(args[0]);
        // Read Matrix-2
        matrix2 = MatrixReader.readNumberFromFile(args[1]);

        List<List<Integer>> resultMatrix = MatrixMultiplicator.multiplication(matrix1, matrix2);

        MatrixWriter.writeMatrixToFile(resultMatrix, args[2]);
    }
}
