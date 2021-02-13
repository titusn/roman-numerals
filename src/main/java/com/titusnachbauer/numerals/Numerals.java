package com.titusnachbauer.numerals;

public class Numerals {
    public String convert(int number) {
        StringBuilder result = new StringBuilder();
        if (number == 6) {
            result.append("VI");
        } else if (number == 5) {
            result.append("V");
        }
        else if (number == 4) {
            result.append("IV");
        } else {
            for (;number >= 1;number--) {
                result.append("I");
            }
        }
        return result.toString();
    }
}
