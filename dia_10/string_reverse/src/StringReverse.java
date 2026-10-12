package dia_10.string_reverse.src;

import javax.swing.*;
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palavra = scanner.nextLine();

        String palavraInvertida = new StringBuffer(palavra).reverse().toString();

        if (palavra.equals(palavraInvertida)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
