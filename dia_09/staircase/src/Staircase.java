package dia_09.staircase.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Staircase {

    public static void staircase(int n) {
        StringBuilder c = new StringBuilder("#");
        int espacos = n;

        for (int i = 0; i < n; i++) {
            System.out.println(" ".repeat(espacos - 1)+ c);
            c.append("#");
            espacos -= 1;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Staircase.staircase(n);

        bufferedReader.close();
    }

}
