package org.example;

import java.util.Scanner;

public class Verification {
    private static final Scanner scanner = new Scanner(System.in);

    /*
     * O seu objetivo é deixar o código principal sem a necessidade de sempre ter uma verificação de valor,
     * embora seja curta, muitas vezes podem serem cansativos de efetuar devido à quantidade necessária a se fazer. Com isso
     * deixa o código mais enxuto.
     * Inicialmente eu desenvolvi apenas uma função para todos os casos, mas tinha a necessidade de passar um argumento
     * para funcionar corretamente, então eu resolvi fazer uma sobrecarga, assim não possuirá mais esse problema, não
     * possuí mais uma única função genérica, a meu ver, deixa o código mais fácil de compreender e de se usar também.
     *
     * OBS: Vale ressaltar que, acaso você deseja deixar mais enxuto o código no arquivo main, assim escrevendo apenas o
     * nome das funções existentes nessa classe, então é recomendado importar da seguinte forma:
     *      import static org.example.Verification.*;
     * Deve-se colocar o '*' no final para trazer todas as funções e não necessitar importar uma por uma.
     */
    public static byte readByte() {
        while (!scanner.hasNextByte()) {
            System.out.print("Entrada inválida! Digite um número válido para byte: ");
            scanner.next();
        }
        return scanner.nextByte();
    }

    public static short readShort() {
        while (!scanner.hasNextShort()) {
            System.out.print("Entrada inválida! Digite um número válido para short: ");
            scanner.next();
        }
        return scanner.nextShort();
    }

    public static int readInt() {
        while (!scanner.hasNextInt()) {
            System.out.print("Entrada inválida! Digite um número válido para int: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static long readLong() {
        while (!scanner.hasNextLong()) {
            System.out.print("Entrada inválida! Digite um número válido para long: ");
            scanner.next();
        }
        return scanner.nextLong();
    }

    public static float readFloat() {
        while (!scanner.hasNextFloat()) {
            System.out.print("Entrada inválida! Digite um número válido para float: ");
            scanner.next();
        }
        return scanner.nextFloat();
    }

    public static double readDouble() {
        while (!scanner.hasNextDouble()) {
            System.out.print("Entrada inválida! Digite um número válido para double: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public static boolean readBoolean() {
        while (!scanner.hasNextBoolean()) {
            System.out.print("Entrada inválida! Digite 'true' ou 'false': ");
            scanner.next();
        }
        return scanner.nextBoolean();
    }

    public static char readChar() {
        String stringWrite;
        while (true) {
            stringWrite = scanner.next();
            if (stringWrite.length() == 1) {
                return stringWrite.charAt(0);
            }
            System.out.print("Entrada inválida! Digite apenas um caractere: ");
        }
    }
}
