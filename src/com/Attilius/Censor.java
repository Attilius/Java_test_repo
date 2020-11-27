package com.Attilius;

import java.util.ArrayList;
import java.util.Arrays;

public class Censor {

    public static void main(String[] args) {

    /*
    Készíts egy publikus függvényt `censor` névvel,
    amely három string-et (karakterláncot) kér paraméterként és egy string-gel tér vissza.
    Az első string (`text`) az a szöveg, amit a függvénynek meg kell majd változtatnia.
    A második string (`originalWord`) lesz az,
    amit minden előfordulása során a harmadik string-re (`newWord`) kell megváltoztatni.
    A függvénynek térjen vissza a módosított string-el.
    Fontos, hogy nem használhatod egyik beépített helyettesítő függvényt sem!

    Példa:

    censor("A kedvenc gyümölcsöm a(z) alma", "alma", "banán");

    Amivel vissza kell térnie: `"A kedvenc gyümölcsöm a(z) banán"`.
     */
        String text = "A kedvenc gyümölcsöm a(z) alma";
        System.out.println(censor(text, "alma", "banán"));

    }

    public static String censor(String text, String originalWord, String newWord) {

        String[] txtArr = text.split("\\s");
        ArrayList<String> textList = new ArrayList<>(Arrays.asList(txtArr));
        for (int i = 0; i < textList.size(); i++) {
            if (textList.get(i).equals(originalWord)) {
                textList.remove(textList.get(i));
                textList.add(i, newWord);
            }
        }

        StringBuilder listString = new StringBuilder();

        for (String s : textList) {
            listString.append(s).append(" ");
        }
        return listString.toString();
    }
}

