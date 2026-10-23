package dia_16.singletonpattern.src;

import java.util.Scanner;

public class SingletonPattern {
    private static SingletonPattern instancia;
    public String str;

    private SingletonPattern() {}

    public static SingletonPattern getSingleInstance() {
        if (instancia == null) {
            instancia = new SingletonPattern();
        }

        return instancia;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase = scanner.nextLine();

        SingletonPattern s = getSingleInstance();
        s.str = "Hello I am a singleton! Let me say " + frase + " to you";
        System.out.println(s.str);
        scanner.close();
    }
}
