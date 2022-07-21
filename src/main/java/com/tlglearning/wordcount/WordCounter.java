package com.tlglearning.wordcount;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordCounter {

  private final Map<String, Integer> counts = new HashMap<>();

  private int totalWords;

  public Set<String> words(){
    return counts.keySet();
  }

  public int get(String word){
    return counts.getOrDefault(word, 0);
  }

  public Map<String, Integer> getCounts() {
    return Collections.unmodifiableMap(counts);
//    these are decorators; their returns both implement the map interface
  }

  public void add(String text){
    String trimmedLine = text.trim();
    if (!trimmedLine.isEmpty()) {
      String[] words = splitWords(trimmedLine);
      countWords(words);
    }
  }

  public int size(){
    return counts.size();
  }

  public int total(){
    return totalWords;
  }

  @Override
  public String toString() {
    return counts.toString();
  }

  String[] splitWords(String text) {
    return text.toLowerCase().split("[\\W_]+");
//        .replaceAll("[\\W_]+", " ") got rid of this and just used split

  }

  void countWords(String[] words) {
    for(String word: words){
//      int previousCount = counts.getOrDefault(word, 0);
      counts.put(word, get(word) +1);
      totalWords++;
    }
  }



}

