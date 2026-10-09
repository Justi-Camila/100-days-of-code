package dia_07.diagonal_difference.src;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int sum1 = 0;
        int sum2 = 0;
        int contador = arr.size();

        for (int j = 0; j < arr.size(); j++) {
            sum1 += arr.get(j).get(j);
        }

        for (int j = 0; j < arr.size(); j++) {
            contador -= 1;
            sum2 += arr.get(j).get(contador);

        }

        // Pode ser substituído por um for each
        for (List<Integer> integers : arr) {
            contador -= 1;
            sum2 += integers.get(contador);

        }

        return Math.abs(sum1-sum2);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = DiagonalDifference.diagonalDifference(arr);
        System.out.println(result);

//      bufferedWriter.write(String.valueOf(result));
//      bufferedWriter.newLine();

        bufferedReader.close();
//      bufferedWriter.close();
    }

}
