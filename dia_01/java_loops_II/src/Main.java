package dia_01.java_loops_II.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();

        for(int i = 0; i < q; i++){

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            int novoTermo;
            int termo = 2;
            int valor = 0;

            while (n != 0) {
                novoTermo = (a * b + valor);

                System.out.print(novoTermo + " ");

                valor += (b * termo);
                termo *= 2;
                n--;
            }
            System.out.println();
        }

        scanner.close();

        }
}