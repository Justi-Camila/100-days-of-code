package dia_12.lonely_integer.src;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class LonelyInteger {

    public static int lonelyinteger(List<Integer> a) {

        Map<Integer, Integer> mapa = new HashMap<>();

        for (int i = 0; i < a.size(); i++) {
            int numero = a.get(i);
            int jaTinha = mapa.getOrDefault(numero, 0);
            mapa.put(numero, jaTinha + 1);
        }

        for (Map.Entry<Integer, Integer> entrada : mapa.entrySet()) {
            if (entrada.getValue() == 1) {
                return entrada.getKey();
            }
        }

        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = LonelyInteger.lonelyinteger(a);

        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }


}
