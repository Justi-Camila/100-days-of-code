package dia_05.simple_array_sum.src;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

public class SimpleArraySum {
    public static int simpleArraySum(List<Integer> ar) {
        int soma = 0;

        // Alternativa com stream (mesmo resultado)
        // return ar.stream().mapToInt(Integer::intValue).sum();

        for (int a : ar) {
            soma += a;
        }
        return soma;
    }

    // Para rodar via IntelliJ, é preciso alterar o bufferedWriter por System.out.println(result); ou usar scanner,
    // o erro ocorre devido ao "OUTPUT_PATH" que só existe no HackerRank
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .toList();

        int result = SimpleArraySum.simpleArraySum(ar);

        System.out.println(result);

        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}


