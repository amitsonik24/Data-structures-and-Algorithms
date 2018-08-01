package com.algorithms.main;

import java.io.IOException;

public class BufferredReaderExample {

	public static void main(String[] args) throws IOException {
      String test= "My name is Sakshi";
      System.out.println(test.charAt(0));
      System.out.println(test.length());
      System.out.println(test.substring(0, 4));
      System.out.println(test.indexOf('n'));
//      System.out.println(test.compareTo("test"));
      System.out.println(test.concat(" and my roll number is 23"));

	}

}
