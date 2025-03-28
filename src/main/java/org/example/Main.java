package org.example;

import static org.example.Verification.*;

public class Main {
    public static void main(String[] args) {
        System.out.print("byte value: ");
        byte byteValue = readByte();

        System.out.print("short value: ");
        short shortValue = readShort();

        System.out.print("int value: ");
        int intValue = readInt();

        System.out.print("long value: ");
        long longValue = readLong();

        System.out.print("float value: ");
        float floatValue = readFloat();

        System.out.print("double value: ");
        double doubleValue = readDouble();

        System.out.print("boolean value: ");
        boolean booleanValue = readBoolean();

        System.out.print("char value: ");
        char charValue = readChar();

        System.out.println(byteValue + " " + shortValue + " " + intValue + " " + longValue + " " +
                floatValue + " " + doubleValue + " " + booleanValue + " " + charValue);
    }
}