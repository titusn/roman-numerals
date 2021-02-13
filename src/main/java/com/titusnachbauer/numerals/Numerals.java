package com.titusnachbauer.numerals;

import java.util.HashMap;

public class Numerals {
    private final String[] ROMAN = {"M","CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private final int[] ARABIC = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

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
