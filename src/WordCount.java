import java.util.Scanner;
import java.util.TreeMap;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string:");
        String str = scanner.nextLine();

        String[] words = str.split("\\W+");
        TreeMap<String, Integer> wordMap = new TreeMap<>();
        for (String word : words) {
            boolean isAppeared = wordMap.containsKey(word);
            if (isAppeared) {
                wordMap.put(word, wordMap.get(word) + 1);
            } else {
                wordMap.put(word, 1);
            }
        }

        System.out.println(wordMap);
    }
}
