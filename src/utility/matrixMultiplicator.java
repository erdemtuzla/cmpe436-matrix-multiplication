package utility;

import java.util.List;
import java.util.ArrayList;

public class MatrixMultiplicator {
    public static List<List<Integer>> multiplication(List<List<Integer>> first, List<List<Integer>> second) {

        List<List<Integer>> result = new ArrayList<>();

        for (List<Integer> list : first) {
            List<Integer> resultRow = new ArrayList<>();

            // Iterate through second matrix's rows
            for (int i = 0; i <= second.size(); i++) {
                int sum = 0;
                
                // Iterate through first matrix's columns
                for (int j = 0; j < list.size(); j++) {
                    sum += list.get(j) * second.get(j).get(i);
                }

                resultRow.add(sum);
            }

            result.add(resultRow);
        }

        return result;
    }
}