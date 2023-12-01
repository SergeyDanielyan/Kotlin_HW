package com.company;

import java.util.ArrayList;

public class CollectionsTasks {
    public static ArrayList<String> ReplaceElements(ArrayList<String> array) {
        ArrayList<String> result = new ArrayList<String>();
        for (String str : array) {
            result.add(str);
        }
        for (int i = 0; i < array.size(); ++i) {
            for (int j = 0; j < i; ++j) {
                if (array.get(i).equals(array.get(j))) {
                    // Совпадает
                    result.set(i, "blahblah");
                    result.set(j, "blahblah");
                }
            }
        }
        return result;
    }

    public static int UniqueWords(String str) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("");
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == ' ') {
                words.add("");
            } else {
                words.set(words.size() - 1, words.get(words.size() - 1) + str.charAt(i));
            }
        }
        ArrayList<String> uniqueWords = new ArrayList<String>();
        for (int i = 0; i < words.size(); ++i) {
            boolean is_unique = true;
            for (String word : uniqueWords) {
                if (word.equals(words.get(i))) {
                    // Слово совпадает с некоторым словом из тех, что уже добавлены
                    is_unique = false;
                    break;
                }
            }
            if (is_unique) {
                uniqueWords.add(words.get(i));
            }
        }
        return uniqueWords.size();
    }

    public static void main(String[] args) {
        String text = "Start Finish Stop Start";
        ArrayList<String> words = new ArrayList<String>();
        words.add("Start");
        words.add("Finish");
        words.add("Stop");
        words.add("Start");
        words = ReplaceElements(words);
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println(UniqueWords("y u i u"));
    }
}
