package org.example;

import java.util.Scanner;

public class Verification {
    private static final Scanner scanner = new Scanner(System.in);

    /*
     * O seu objetivo é deixar o código principal sem a necessidade de sempre ter uma verificação de valor,
     * embora seja curta, muitas vezes podem serem cansativos de efetuar devido à quantidade necessária a se fazer. Com isso
     * deixa o código mais enxuto.
     */
    public static <T> T readObject(Class<T> valueType) {
        T readValue = null;

        if (valueType == Byte.class) {
            while (!scanner.hasNextByte()) {
                System.out.print("Entrada inválida! Digite um número válido para byte: ");
                scanner.next();
            }
            readValue = valueType.cast(scanner.nextByte());
        } else if (valueType == Short.class) {
            while (!scanner.hasNextShort()) {
                System.out.print("Entrada inválida! Digite um número válido para short: ");
                scanner.next();
            }
            readValue = valueType.cast(scanner.nextShort());
        } else if (valueType == Integer.class) {
            while (!scanner.hasNextInt()) {
                System.out.print("Entrada inválida! Digite um número válido para int: ");
                scanner.next();
            }
            readValue = valueType.cast(scanner.nextInt());
        } else if (valueType == Long.class) {
            while (!scanner.hasNextLong()) {
                System.out.print("Entrada inválida! Digite um número válido para long: ");
                scanner.next();
            }
            readValue = valueType.cast(scanner.nextLong());
        } else if (valueType == Float.class) {
            while (!scanner.hasNextFloat()) {
                System.out.print("Entrada inválida! Digite um número válido para float: ");
                scanner.next();
            }
            readValue = valueType.cast(scanner.nextFloat());
        } else if (valueType == Double.class) {
            while (!scanner.hasNextDouble()) {
                System.out.print("Entrada inválida! Digite um número válido para double: ");
                scanner.next();
            }
            readValue = valueType.cast(scanner.nextDouble());
        } else if (valueType == Boolean.class) {
            while (!scanner.hasNextBoolean()) {
                System.out.print("Entrada inválida! Digite 'true' ou 'false': ");
                scanner.next();
            }
            readValue = valueType.cast(scanner.nextBoolean());
        } else if (valueType == Character.class) {
            String stringWrite;
            while (true) {
                stringWrite = scanner.next();
                if (stringWrite.length() == 1) {
                    readValue = valueType.cast(stringWrite.charAt(0));
                    break;
                }
                System.out.print("Entrada inválida! Digite apenas um caractere: ");
            }
        }

        return readValue;
    }
}
