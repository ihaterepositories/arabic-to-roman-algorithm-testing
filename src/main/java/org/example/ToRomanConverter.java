package org.example;

/*
  @author   Oleh
  @project   ArabicToRomanConverterTesting
  @class  ToRomanConverter
  @version  1.0.0 
  @since 19.08.2024 - 19.07
*/

public class ToRomanConverter {

    public static String convert(int num) {

        if (num < 1 || num > 3999) {
            return null;
        }

        StringBuilder romanNumber = new StringBuilder();

        String[] romanNumerals = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] arabicValues = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

        for (int i = arabicValues.length - 1; i >= 0; i--) {
            while (num >= arabicValues[i]) {
                romanNumber.append(romanNumerals[i]);
                num -= arabicValues[i];
            }
        }

        return romanNumber.toString();
    }

}
