package com.titusnachbauer.numerals;

import java.util.*;

public class Numerals {
    private final SortedMap<Integer, String> ARABIC_TO_ROMAN = new TreeMap<>(Collections.reverseOrder()) {{
        put(1000, "M");
        put(900, "CM");
        put(500, "D");
        put(400, "CD");
        put(100, "C");
        put(90, "XC");
        put(50, "L");
        put(40, "XL");
        put(10, "X");
        put(9, "IX");
        put(5, "V");
        put(4, "IV");
        put(1, "I");
    }};

    public String convert(int number) {
        StringBuilder result = new StringBuilder();
        int remaining = number;
        for (Map.Entry<Integer, String> entry  : ARABIC_TO_ROMAN.entrySet()) {
            while (remaining >= entry.getKey()) {
                result.append(entry.getValue());
                remaining -= entry.getKey();
            }
        }
        return result.toString();
    }
}
