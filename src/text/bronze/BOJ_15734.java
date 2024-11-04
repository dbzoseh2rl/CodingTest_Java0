package text.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15734 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int L = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());

        int sum = L + R + A;
        int value = A - Math.abs(L - R);

        System.out.println(value >= 0 ? sum - value % 2 : sum - Math.abs(value));
    }
}
