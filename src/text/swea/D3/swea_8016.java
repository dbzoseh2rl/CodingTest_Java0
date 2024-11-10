package text.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_8016 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            sb.append("#").append(tc).append(" ");
            long n = Integer.parseInt(br.readLine());
            long left = (n - 1) * (n - 1) * 2 + 1;
            long right = n * n * 2 - 1;

            sb.append(left).append(" ").append(right).append("\n");
        }
        System.out.println(sb);
    }
}
