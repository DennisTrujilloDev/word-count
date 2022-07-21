package com.tlglearning.wordcount;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.print.DocFlavor.STRING;

public final class WordCounter {

  private final Map<String, Integer> counts;


  public WordCounter(String text) {
    String[] words = splitWords(text);
    counts = Collections.unmodifiableMap(countWords(words));
  }

  public Set<String> words(){
    return counts.keySet();
  }

  public int getCount(String word){
    return counts.getOrDefault(word, 0);
  }

  public Map<String, Integer> getCounts() {
    return counts;
  }


  @Override
  public String toString() {
    return counts.toString();
  }

  String[] splitWords(String text) {
    return text.toLowerCase().split("[\\W_]+");
//        .replaceAll("[\\W_]+", " ") got rid of this and just used split

  }

  Map<String, Integer> countWords(String[] words) {
    Map<String, Integer> counts = new HashMap<>();
    for(String word: words){
      //DONE check if word is present as key in counts:
      //  if its nto present add it to counts with value 1
      //  otherwise, get current value, add 1 to it, and update map
      //  with new value
      if(!counts.containsKey(word)){
        counts.put(word, 1);
//      .put() method of HashMap is used to insert a mapping into a map.
      }else{
        int previousCount = counts.get(word);
        counts.put(word, previousCount +1);
      }
    }
    return counts;
  }



}

