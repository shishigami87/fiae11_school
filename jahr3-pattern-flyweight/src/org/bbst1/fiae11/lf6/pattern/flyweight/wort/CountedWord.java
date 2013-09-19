package org.bbst1.fiae11.lf6.pattern.flyweight.wort;

import java.util.HashSet;
import java.util.Set;

public class CountedWord {

	private final String wort;
	private int anzahl;

	private static Set<CountedWord> worte = new HashSet<CountedWord>();

	public static boolean countWord(String word) {
		for (CountedWord w : worte) {
			if (w.wort.equals(word)) {
				w.anzahl++;
				return true;
			}
		}
		new CountedWord(word);
		return false;
	}

	private CountedWord(String wort) {
		worte.add(this);
		this.wort = wort;
		this.anzahl = 1;
	}

	public static Set<CountedWord> getWorte() {
		return worte;
	}

	public String getWort() {
		return wort;
	}

	public int getAnzahl() {
		return anzahl;
	}

}
