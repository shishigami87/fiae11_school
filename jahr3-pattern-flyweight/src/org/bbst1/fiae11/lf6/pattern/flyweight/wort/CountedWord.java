package org.bbst1.fiae11.lf6.pattern.flyweight.wort;

import java.util.HashSet;
import java.util.Set;

public class CountedWord {

    private final String wort;
    private int anzahl;

    private static Set<CountedWord> worte = new HashSet<CountedWord>();

    /**
     * @param word Das neue Wort das gespeichert werden soll
     * @return True oder False. Je nachdem ob es das Wort schon gab oder eines neues Objekt hinzugefügt werden musste
     */
    public static boolean countWord(String word) {
        //Gehe in einer Schleife alle bereits gespeicherten
        //Wörter durch und überprüfe ob das übergebene Wort
        //bereits in dieser Liste ist
        for (CountedWord w : worte) {
            if (w.wort.equals(word)) {
                w.anzahl++;
                return true;
            }
        }
        //Wenn es nicht in der Liste ist erstelle ein neues Objekt
        new CountedWord(word);
        return false;
    }

    /**
     * Konstruktor der ein Wort in Form eines Strings übergeben bekommt
     *
     * @param wort Das zu speichernde Wort
     */
    private CountedWord(String wort) {
        worte.add(this);
        this.wort = wort;
        this.anzahl = 1;
    }

    /**
     * Diese Methode gibt ein Set mit allen gespeicherten Wörtern zurück
     *
     * @return Ein Set von gespeicherten Wörter
     */
    public static Set<CountedWord> getWorte() {
        return worte;
    }

    /**
     * @return Das Wort das von dem Objekt dargestellt wird
     */
    public String getWort() {
        return wort;
    }

    /**
     * @return Die Anzahl wie oft das Wort gespeichert wurde
     */
    public int getAnzahl() {
        return anzahl;
    }
}
