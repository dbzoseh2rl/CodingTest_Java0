import java.io.*;
import java.util.*;

class Solution {
    static class MyScanner {
        StringTokenizer st;
        BufferedReader bf;

        MyScanner() {
            bf = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(bf.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        int N = sc.nextInt();

        // HashMap to store the count of each prefix
        Map<String, Integer> prefixCount = new HashMap<>();
        // HashMap to count occurrences of words
        Map<String, Integer> wordCount = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String word = sc.next();
            String prefix = "";

            // Find the shortest unique prefix
            for (int j = 0; j < word.length(); j++) {
                prefix += word.charAt(j);
                prefixCount.put(prefix, prefixCount.getOrDefault(prefix, 0) + 1);

                // Stop as soon as we find a unique prefix
                if (prefixCount.get(prefix) == 1) {
                    break;
                }
            }

            // Determine the unique representation of the word
            if (!wordCount.containsKey(word)) {
                wordCount.put(word, 1);
                System.out.println(prefix); // Print unique prefix for the first occurrence
            } else {
                wordCount.put(word, wordCount.get(word) + 1);
                System.out.println(word + wordCount.get(word)); // Add number for subsequent occurrences
            }
        }
    }
}
