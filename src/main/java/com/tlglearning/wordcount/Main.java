package com.tlglearning.wordcount;


import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

  public static final String HOUND_OF_THE_BASKERVILLES_TXT = "hound-of-the-baskervilles.txt";

  public static void main (String[] args) throws URISyntaxException, IOException {
    URI uri = Main.class
        .getClassLoader()
        .getResource(HOUND_OF_THE_BASKERVILLES_TXT)
        .toURI();
    Path path = Paths.get(uri);
    String text = Files.readString(path);
    WordCounter counter = new WordCounter(text);
    System.out.println(counter);

  }

}
