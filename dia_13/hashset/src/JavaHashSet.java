package dia_13.hashset.src;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JavaHashSet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> set = new HashSet<>();

        int contador = scanner.nextInt();

        for (int i = 0; i < contador; i++) {
            String nome1 = scanner.next();
            String nome2 = scanner.next();

            String chave;

            if (nome1.compareTo(nome2) < 0) {
               chave = nome1+ " " + nome2;
            } else {
                chave = nome2 + " " + nome1;
            }

            set.add(chave);

            System.out.println(set.size());
        }

    }
}
