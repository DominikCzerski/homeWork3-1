package homeWork_13.listaSlowWPliku;

import java.util.ArrayList;
import java.util.Collections;

public class ListTest {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(FileModify.read("src/homeWork_13/listaSlowWPliku/words.txt"));

        System.out.println(longestWord(strings));
        System.out.println(shortestWord(strings));
        System.out.println(sumOfAllWords(strings));

    }

    static String longestWord(ArrayList<String> list) {
        int longestWordLength = 0;
        String longestWord = null;
        for (String s : list) {
            if (s.length() > longestWordLength) {
                longestWordLength = s.length();
                longestWord = s;
            }
        }
        return longestWord;
    }

    static String shortestWord(ArrayList<String> list) {
        int shortestWordLength = list.get(0).length();
        String shortestWord = null;
        for (String s : list) {
            if (s.length() < shortestWordLength) {
                shortestWordLength = s.length();
                shortestWord = s;
            }
        }
        return shortestWord;
    }

    static int sumOfAllWords(ArrayList<String> list) {
        int countWords = 0;
        for (String s : list) {
            countWords += s.length();
        }
        return countWords;
    }


}
