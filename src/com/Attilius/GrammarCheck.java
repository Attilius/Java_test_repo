package com.Attilius;

import java.util.ArrayList;

public class GrammarCheck {

    public static void main(String[] args) {
          /*
    Készíts egy publikus függvényt `grammarCheck` névvel,
    amely egy string-et (`text`) vár paraméterként,
    és ellenőrzi, hogy a kapott string-ben a `.` írásjelek után
    az első betűk mindenhol nagybetűk-e.
    A választ a függvény egy boolean (logikai) értékként adja vissza.

    Példák:

    grammarCheck("Ez egy jó példa. Ez egy jó példa.");

    Amivel vissza kell térnie: `true`.

    grammarCheck("ez még mindig egy jó példa. Hiszen a második mondat nagybetűvel kezdődik.");

    Amivel vissza kell térnie: `true`.

    grammarCheck("Ez egy rossz példa. itt nincs nagybetű.");

    Amivel vissza kell térnie: `false`.
    */

        System.out.println(grammarCheck("Ez egy jó példa. Ez egy jó példa."));
    }

    public static Boolean grammarCheck(String text) {

        ArrayList<Integer> listOfIndex = new ArrayList<>();
        ArrayList<Character> listOfCharacter = new ArrayList<>();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '.'){
                listOfIndex.add(i+2);
            }
        }

        int lastItemOfListOfIndex = listOfIndex.get(listOfIndex.size()-1);
        int indexOfLastItem = listOfIndex.size()-1;
        if (lastItemOfListOfIndex > text.length()) {
            listOfIndex.remove(indexOfLastItem);
        }

        for (Integer i : listOfIndex) {
            for (int j = 0; j < text.length(); j++) {
                if (j == i) {
                    listOfCharacter.add(text.charAt(i));
                }
            }
        }

        boolean result = false;
        for (Character c :listOfCharacter) {
            result = Character.isUpperCase(c);
        }

        return result;
    }
}
