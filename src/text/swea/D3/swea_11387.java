package text.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_11387 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int TC = Integer.parseInt(br.readLine());
        for (int t = 1; t <= TC; t++) {
            st = new StringTokenizer(br.readLine());

            double D = Double.parseDouble(st.nextToken());
            double L = Double.parseDouble(st.nextToken())*0.01;
            int N = Integer.parseInt(st.nextToken());

            double answer = 0;
            for (int i = 0; i < N; i++) {
                answer += D * (1 + (i * L));
            }
//            System.out.printf("#%d %.0f\n", t, answer);
            sb.append("#").append(t).append(" ").append((int) answer).append("\n");
        }
        System.out.println(sb);
    }
}
