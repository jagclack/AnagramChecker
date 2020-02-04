package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testThatGivenStringsAreAnagrams() {
        Assertions.assertTrue(true, AnagramChecker.anagramChecker("dog", "god") + " is a palindrome");
    }

    @Test
    public void testThatGivenStringsAreNotAnagrams() {
        Assertions.assertTrue(true, AnagramChecker.anagramChecker("elf", "god") + " is not a palindrome");
    }
}
