package com.console;

public class Main {

    public static void main(String[] args) {
        float floatValue = 1.0f;
        double doubleValue = 4.0d;
        byte byteValue = 7;
        short shortValue = 7;
        long longValue = 5;

        short result1 = (short)longValue;
        short result2 = (short)(byteValue - longValue);
        double result3 = longValue - doubleValue;
        long result4 = (long)(shortValue - longValue + floatValue + doubleValue);

        System.out.println("Success!");
    }
}
