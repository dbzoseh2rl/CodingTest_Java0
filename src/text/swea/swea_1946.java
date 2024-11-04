package text.swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_1946 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // Number of test cases

        for (int tc = 1; tc <= T; tc++) {
            int n = Integer.parseInt(br.readLine()); // Number of input lines
            StringBuilder sb = new StringBuilder(); // StringBuilder to accumulate characters

            // Read input characters and repetition counts
            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String A = st.nextToken(); // Character (e.g., "A")
                int B = Integer.parseInt(st.nextToken()); // Repetition count (e.g., 10)

                // Append character A repeated B times to the StringBuilder
                sb.append(A.repeat(B));
            }

            // Output the test case number
            System.out.println("#" + tc);

            // Print the accumulated string in chunks of 10 characters per line
            for (int i = 0; i < sb.length(); i += 10) {
                if (i + 10 <= sb.length()) {
                    System.out.println(sb.substring(i, i + 10)); // Print 10-character chunk
                } else {
                    System.out.println(sb.substring(i)); // Print remaining characters
                }
            }
        }

        br.close(); // Close the BufferedReader
    }
}
