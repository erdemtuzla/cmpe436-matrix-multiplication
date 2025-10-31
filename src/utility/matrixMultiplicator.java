package utility;

import java.util.List;
import java.util.ArrayList;

public class MatrixMultiplicator {
    public static List<List<Integer>> multiplication(List<List<Integer>> first, List<List<Integer>> second)
            throws Exception {

        // Check for null or empty matrices first
        if (first == null || second == null || first.isEmpty() || first.get(0).isEmpty() || second.isEmpty()
                || second.get(0).isEmpty()) {
            throw new Exception("Matrices cannot be null or empty!");
        }

        int firstCols = first.get(0).size();

        // Handle incompatible sized matrices
        if (firstCols != second.size()) {
            throw new Exception("Matrices are incompatible to establish a multiplication!");
        }

        List<List<Integer>> result = new ArrayList<>();

        // Set dimensions for the multiplication loopss
        int resultCols = second.get(0).size();

        for (List<Integer> list : first) {
            List<Integer> resultRow = new ArrayList<>();

            // Iterate through second matrix's rows
            for (int i = 0; i < resultCols; i++) {
                int sum = 0;

                // Iterate through first matrix's columns
                for (int j = 0; j < firstCols; j++) {
                    sum += list.get(j) * second.get(j).get(i);
                }

                resultRow.add(sum);
            }

            result.add(resultRow);
        }

        return result;
    }
}