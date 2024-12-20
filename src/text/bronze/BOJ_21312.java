package text.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_21312 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
            System.out.println(a * b * c);
        } else {
            int result = 1;
            if (a % 2 == 1) {
                result *= a;
            }
            if (b % 2 == 1) {
                result *= b;
            }
            if (c % 2 == 1) {
                result *= c;
            }
            System.out.println(result);
        }
    }
}
