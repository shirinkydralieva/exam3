package task4;

import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("apple", "яблоко");
        dictionary.put("pear", "груша");
        dictionary.put("grape", "виноград");
        dictionary.put("orange", "апельсин");
        System.out.println("Enter word: (in english)");
        findWord(dictionary);
    }

    public static void findWord(HashMap<String, String> dictionary){
        String findWord = new Scanner(System.in).nextLine();
        if (dictionary.containsKey(findWord)){
            System.out.println("Here is translation of word: " + dictionary.get(findWord));
        } else{
            System.out.println("There is no such word in the dictionary");
        }
    }
}
