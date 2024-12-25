package text.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_20551 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#").append(tc).append(" ");
            st = new StringTokenizer(br.readLine());

            int cnt = 0;
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            if (B >= C) {
                cnt += (B - C + 1);
                B -= cnt;
            }
            if (A >= B) {
                cnt += (A - B + 1);
                A -= cnt;
            }
            if (A <= 0) {
                sb.append(-1);
            }
            else {
                sb.append(cnt);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
