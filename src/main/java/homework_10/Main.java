package homework_10;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        char[] charArray = args[0].toCharArray();
        Map<Character, Integer> result = countOfLetter(charArray);
        System.out.println(result);
        System.out.println(result.keySet());

    }

    private static Map<Character, Integer> countOfLetter (char[] charArray){
        Map<Character, Integer> charCounter = new HashMap<>();
        for (Character c: charArray) {
            charCounter.put(c, charCounter.getOrDefault(c, 0) + 1);
        }
        return charCounter;
    }
}
