package com.titusnachbauer.numerals;

public class Numerals {
    public String convert(int i) {
        StringBuilder result = new StringBuilder();
        for (;i >= 1;i--) {
            if (i % 4 == 0) {
                result.append("IV");
                break;
            }
            result.append("I");
        }
        return result.toString();
    }
}
