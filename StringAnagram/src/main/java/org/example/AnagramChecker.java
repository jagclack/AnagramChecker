package org.example;

import java.util.Arrays;

public class AnagramChecker {
    public static boolean anagramChecker(String firstWord, String secondWord) {
        if (firstWord.length() != secondWord.length()) {
            return false;
        } else {
            char[] firstWordArr = firstWord.toCharArray();
            char[] secondWordArr = secondWord.toCharArray();
            Arrays.sort(firstWordArr);
            Arrays.sort(secondWordArr);

            return Arrays.equals(firstWordArr, secondWordArr);
        }
    }
}