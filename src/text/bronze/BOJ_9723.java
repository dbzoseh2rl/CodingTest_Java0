package text.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_9723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim());

        for (int caseNum = 1; caseNum <= T; caseNum++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] sides = new int[3];
            for (int i = 0; i < 3; i++) {
                sides[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(sides);
            int a = sides[0], b = sides[1], c = sides[2];

            if (a * a + b * b == c * c) {
                sb.append("Case #").append(caseNum).append(": YES\n");
            } else {
                sb.append("Case #").append(caseNum).append(": NO\n");
            }
        }

        System.out.print(sb.toString());
    }

}
