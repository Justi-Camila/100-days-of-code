// HackerRank Java Datatypes

package dia_04.java_datatypes.src;

import java.util.Scanner;

public class DataTypes {

    // Tempo: O(t) — um laço com t casos, cada um com comparações constantes
    // Espaço: O(1) — só variáveis simples
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for(int i = 0; i < t; i++) {
            try {
                long x = scanner.nextLong();
                System.out.println(x + " can be fitted in:");
                if(x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE)System.out.println("* byte");
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) System.out.println("* short");
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) System.out.println("* int");

                // não precisa do if, pois cabe em long por definição
                System.out.println("* long");
            }
            catch(Exception e) {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }
    }
}

