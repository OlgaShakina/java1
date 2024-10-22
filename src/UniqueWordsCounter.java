package src;

import java.util.HashMap;
import java.util.Map;

public class UniqueWordsCounter {
    public static void main(String[] args) {
        String[] words = {
                "mango", "avocado", "mango", "avocado",
                "grape", "grape", "orange", "grape", "avocado",
                "peach", "grape", "mango", "avocado", "peach"
        };

        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        System.out.println("Уникальные слова и их количество:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
