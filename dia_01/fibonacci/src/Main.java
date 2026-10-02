package dia_01.fibonacci.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor: ");
        int valor = scanner.nextInt();

        int t1 = 1;
        int t2 = 1;
        int novoTermo;

        System.out.printf("%s + %s + ", t1, t2);

        for (int i = 1; i <= valor; i++) {
            novoTermo = t1 + t2;
            t1 = t2;
            t2 = novoTermo;

            System.out.print(novoTermo + " + ");
        }

    }
}