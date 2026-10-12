import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashtagFrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine().toLowerCase();

        String[] words = text.split("\\s+");
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (word.matches("#[a-z0-9_]+")) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        sc.close();
    }
}

Input:

Enter text: #java #coding #java #programming #coding #java

Output:

#java: 3
#coding: 2
#programming: 1