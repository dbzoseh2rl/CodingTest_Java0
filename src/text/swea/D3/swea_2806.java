package text.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_2806 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int K = 1 ;K <= T; K++) {
            int N = Integer.parseInt(br.readLine());
            int[][] map = new int[N][N];
            int result = 0;

            for (int i = 0; i < N; i++) {
                String line = br.readLine();
                for (int j = 0; j < N; j++) {
                    map[i][j] = line.charAt(j) - '0';
                }
            }

            int mid = N / 2;
            int L = mid;
            int R = mid;

            for (int i = 0; i < N; i++) {
                for (int j = L; j <= R; j++) {
                    result += map[i][j];
                }
                if (i < mid) {
                    L--;
                    R++;
                } else {
                    L++;
                    R--;
                }
            }
            System.out.println("#" + K + " " + result);
        }
    }
}
