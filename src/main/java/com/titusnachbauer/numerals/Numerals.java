package com.titusnachbauer.numerals;

public class Numerals {
    private final String[] ROMAN = {"IX", "V", "IV", "I"};
    private final int[] ARABIC = {9, 5, 4, 1};

    public String convert(int number) {
        StringBuilder result = new StringBuilder();
        int remaining = number;
        for (int i = 0; i < ARABIC.length; i++) {
            if (remaining >= ARABIC[i]) {
                result.append(ROMAN[i]);
                remaining -= ARABIC[i];
            }
        }
        result.append("I".repeat(Math.max(0, remaining)));
        return result.toString();
    }
}
