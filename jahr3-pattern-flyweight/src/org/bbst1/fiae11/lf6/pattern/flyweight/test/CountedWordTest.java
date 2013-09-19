package org.bbst1.fiae11.lf6.pattern.flyweight.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.bbst1.fiae11.lf6.pattern.flyweight.wort.CountedWord;

public class CountedWordTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("testText.txt")));
			String temp = null;
			while ((temp = br.readLine()) != null) {
				temp = temp.replaceAll("\\W", " ");
				String[] wordsInLine = temp.split(" ");
				for (String string : wordsInLine) {
					CountedWord.countWord(string);
				}
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (CountedWord wort : CountedWord.getWorte()) {
			System.out.println(wort.getWort() + ": " + wort.getAnzahl());
		}

	}
}
