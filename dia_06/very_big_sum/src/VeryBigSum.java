package dia_06.very_big_sum.src;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

public class VeryBigSum {

    public static long aVeryBigSum(List<Long> ar) {

        // Utilizando stream para realizar a soma dos valores Long
        return ar.stream().mapToLong(Long::longValue).sum();
    }

    // Para rodar via IntelliJ, é preciso alterar o bufferedWriter por System.out.println(result); ou usar scanner,
    // o erro ocorre devido ao "OUTPUT_PATH" que só existe no HackerRank
    public static void main(String[] args)throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//          BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int arCount = Integer.parseInt(bufferedReader.readLine().trim());

            List<Long> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Long::parseLong)
                    .toList();

            long result = VeryBigSum.aVeryBigSum(ar);
            System.out.println(result);

//          bufferedWriter.write(String.valueOf(result));
//          bufferedWriter.newLine();

            bufferedReader.close();
//          bufferedWriter.close();
    }
}
