package text.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4335 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int low = 1;
        int high = 10;
        int a;

        while (true) {
            a = Integer.parseInt(br.readLine());
            if (a == 0) break;

            String b = br.readLine();

            if (b.equals("too high")) {
                high = Math.min(high, a - 1);
            } else if (b.equals("too low")) {
                low = Math.max(low, a + 1);
            } else if (b.equals("right on")) {
                // 정답 판정
                if (a >= low && a <= high) {
                    System.out.println("Stan is honest");
                } else {
                    System.out.println("Stan may be dishonest");
                }

                low = 1;
                high = 10;
            }
        }
    }

}
