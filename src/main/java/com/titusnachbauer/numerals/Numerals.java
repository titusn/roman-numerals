package com.titusnachbauer.numerals;

public class Numerals {
    private final String[] ROMAN = {"XL", "X", "IX", "V", "IV", "I"};
    private final int[] ARABIC = {40, 10, 9, 5, 4, 1};

    public String convert(int number) {
        StringBuilder result = new StringBuilder();
        int remaining = number;
        for (int i = 0; i < ARABIC.length; i++) {
            while (remaining >= ARABIC[i]) {
                result.append(ROMAN[i]);
                remaining -= ARABIC[i];
            }
        }
        return result.toString();
    }
}
