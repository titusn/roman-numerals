package com.titusnachbauer.numerals;

public class Numerals {
    public String convert(int i) {
        StringBuilder result = new StringBuilder();
        if (i == 5) {
            result.append("V");
        }
        else if (i == 4) {
            result.append("IV");
        } else {
            for (;i >= 1;i--) {
                result.append("I");
            }
        }
        return result.toString();
    }
}
