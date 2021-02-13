package com.titusnachbauer.numerals;

public class Numerals {
    private final String[] ROMAN = {"X", "IX", "V", "IV", "I"};
    private final int[] ARABIC = {10, 9, 5, 4, 1};

    public String convert(int number) {
        StringBuilder result = new StringBuilder();
        int remaining = number;
        for (int i = 0; i < ARABIC.length; i++) {
            while (remaining >= ARABIC[i]) {
                result.append(ROMAN[i]);
                remaining -= ARABIC[i];
            }
        }
        result.append("I".repeat(Math.max(0, remaining)));
        return result.toString();
    }
}
