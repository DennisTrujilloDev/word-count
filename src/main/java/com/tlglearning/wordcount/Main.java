package com.tlglearning.wordcount;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main {

  public static final String HOUND_OF_THE_BASKERVILLES_TXT = "hound-of-the-baskervilles.txt";

  public static void main (String[] args) throws IOException {

    try(InputStream input = Main.class.getClassLoader().getResourceAsStream(HOUND_OF_THE_BASKERVILLES_TXT);
        Reader reader = new InputStreamReader(input);
        BufferedReader buffer = new BufferedReader(reader);
//        the three resources implemented that will auto close
//        regardless of whether we are successful or not
    )
    {
      WordCounter counter = new WordCounter();
      String line;
      while((line = buffer.readLine()) != null){
        //as soon as we have passed the last line, itll be equal to null
        //TODO pass line to a method of WordCounter
        counter.add(line);
    }
      //TODO do sth w WordCounter
      System.out.println(counter);

    }
  }

}
