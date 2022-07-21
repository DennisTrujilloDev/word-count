package com.tlglearning.wordcount;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WordCounterTest {
WordCounter counter = new WordCounter();
  @Test
  void splitWords() {
    String input = "The quick brown fox jumps.";
    String[] expected = {"the", "quick", "brown", "fox", "jumps"};
    String[] actual = counter.splitWords(input);
    assertArrayEquals(expected, actual);
//    expected first  to make test more readable
  }
}