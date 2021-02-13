package com.titusnachbauer.numerals;

public class Numerals {
    public String convert(int number) {
        StringBuilder result = new StringBuilder();
        int remaining = number;
        if (remaining >= 9) {
            result.append("IX");
            remaining -= 9;
        } else if (remaining >= 5) {
            result.append("V");
            remaining -= 5;
        }
        else if (remaining >= 4) {
            result.append("IV");
            remaining -= 4;
        }
        result.append("I".repeat(Math.max(0, remaining)));
        return result.toString();
    }
}
