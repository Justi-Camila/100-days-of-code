package dia_11.mini_max_sum.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MiniMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        List<Integer> copia = new ArrayList<>(arr);
        List<Integer> copia2 = new ArrayList<>(arr);

        long somaMinima;
        long somaMaxima;

        Integer valorMaximo = Collections.max(copia);
        Integer valorMinimo = Collections.min(copia);

        copia.remove(valorMinimo);
        copia2.remove(valorMaximo);

        somaMinima = copia2.stream().mapToLong(Integer::longValue).reduce(0L, Long::sum);

        somaMaxima = copia.stream().mapToLong(Integer::longValue).reduce(0L, Long::sum);

        System.out.print(somaMinima + " " + somaMaxima);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        MiniMaxSum.miniMaxSum(arr);

        bufferedReader.close();
    }

}
