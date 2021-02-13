package com.titusnachbauer.numerals;

public class Numerals {
    public String convert(int i) {
        StringBuilder result = new StringBuilder();
        for (;i >=  1;i--) {
            result.append("I");
        }
        return result.toString();
    }
}
