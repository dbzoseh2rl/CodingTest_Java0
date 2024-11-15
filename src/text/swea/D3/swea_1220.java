package text.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_1220 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = 10;

        for (int tc = 1; tc <= T; tc++) {
            sb.append("#").append(tc).append(" ");
            int N = Integer.parseInt(br.readLine());

            // 2차원 배열 선언 및 초기화;
            int[][] map = new int[N][N];
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }

            }
            int cnt = 0;
            for (int i = 0; i < N; i++) {
                boolean n = false;
                boolean s = false;
                for (int j = 0; j < N; j++) {
                    if (map[j][i] == 1) {
                        n = true;
                        s = false;
                    }
                    if (map[j][i] == 2) {
                        s = true;

                    }
                    if (n && s) {
                        cnt ++;
                        n = false;
                        s = false;
                    }
                }

            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
}
