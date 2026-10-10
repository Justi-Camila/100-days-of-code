package dia_08.plus_minus.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        double somaPositiva = 0.0;
        double somaNegativa = 0.0;
        double soma = 0.0;

        for (Integer array : arr) {
            if (array > 0) {
                somaPositiva += 1;
            } else if (array < 0) {
                somaNegativa += 1;
            } else {
                soma += 1;
            }
        }

        double v = somaPositiva / arr.size();
        System.out.printf("%.6f \n", v);

        double v1 = somaNegativa/ arr.size();
        System.out.printf("%.6f \n", v1);

        double v2 = soma/ arr.size();
        System.out.printf("%.6f \n", v2);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .toList();

        PlusMinus.plusMinus(arr);

        bufferedReader.close();
    }

}
