package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testThatGivenStringsAreAnagrams() {
        Assertions.assertTrue(AnagramChecker.anagramChecker("dog", "god"));
    }

    @Test
    public void testThatGivenStringsAreNotAnagrams() {
        Assertions.assertFalse(AnagramChecker.anagramChecker("elf", "god"));
    }

    @Test
    public void testThatDifferentLengthStringsAreNotAnagrams() {
        Assertions.assertFalse(AnagramChecker.anagramChecker("do", "dog"));
    }

    @Test
    public void testThatEmptyStringsAreAnAnagram() {
        Assertions.assertTrue(AnagramChecker.anagramChecker("", ""));
    }

    @Test
    public void testThatMethodIgnoresCase() {
        Assertions.assertTrue(AnagramChecker.anagramChecker("dOg", "God"));
    }

    @Test
    public void testThatNumbersWithinStringsAreAnagrams() {
        Assertions.assertTrue(AnagramChecker.anagramChecker("3947", "4973"));
    }

    @Test
    public void testThatNumbersWithinStringsAreNotAnagrams() {
        Assertions.assertFalse(AnagramChecker.anagramChecker("5678", "1234"));
    }
}
