package com.titusnachbauer.numerals;

public class Numerals {
    public String convert(int number) {
        StringBuilder result = new StringBuilder();
        int remaining = number;
        if (number >= 5) {
            result.append("V");
            remaining -= 5;
        }
        else if (number == 4) {
            result.append("IV");
            remaining -= 4;
        }
        result.append("I".repeat(Math.max(0, remaining)));
        return result.toString();
    }
}
