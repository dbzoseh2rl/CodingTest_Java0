package text.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_7532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int TC = 1; TC <= T; TC++) {
            sb.append("#").append(TC).append(" ");
            st = new StringTokenizer(br.readLine());

            int S = Integer.parseInt(st.nextToken()) - 1;
            int E = Integer.parseInt(st.nextToken()) - 1;
            int M = Integer.parseInt(st.nextToken()) - 1;

            while (S % 24 != E || S % 29 != M) {
                S += 365;
            }
            sb.append(S+1).append("\n");
        }
        System.out.println(sb);
    }
}
