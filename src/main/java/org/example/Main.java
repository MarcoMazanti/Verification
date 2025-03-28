package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.print("byte value: ");
        byte byteValue = Verification.readObject(Byte.class);

        System.out.print("short value: ");
        short shortValue = Verification.readObject(Short.class);

        System.out.print("int value: ");
        int intValue = Verification.readObject(Integer.class);

        System.out.print("long value: ");
        long longValue = Verification.readObject(Long.class);

        System.out.print("float value: ");
        float floatValue = Verification.readObject(Float.class);

        System.out.print("double value: ");
        double doubleValue = Verification.readObject(Double.class);

        System.out.print("boolean value: ");
        boolean booleanValue = Verification.readObject(Boolean.class);

        System.out.print("char value: ");
        char charValue = Verification.readObject(Character.class);

        System.out.println(byteValue + " " + shortValue + " " + intValue + " " + longValue + " " +
                floatValue + " " + doubleValue + " " + booleanValue + " " + charValue);
    }
}