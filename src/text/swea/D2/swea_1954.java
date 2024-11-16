package text.swea.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class swea_1954 {
    static int[] dr = { 0, 1, 0, -1 }; // 우하좌상 순서
    static int[] dc = { 1, 0, -1, 0 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int TC = 1; TC <= T; T++) {
            int N = Integer.parseInt(br.readLine());
            int[][] map = new int[N][N];

            int dir = 0; // 현재 방향 인덱스
            int r = 0, c = 0; // 시작 좌표
            for (int i = 1; i <= N * N; i++) { // 1부터 N*N까지 숫자를 배열에 넣기
                map[r][c] = i;
                if (r + dr[dir] >= N || r + dr[dir] < 0 || c + dc[dir] >= N || c + dc[dir] < 0
                        || map[r + dr[dir]][c + dc[dir]] != 0) {
                    // 배열을 벗어나는지 //그 자리에 숫자가 입려되있는지 확인
                    dir = (dir + 1) % 4; // 방향전환
                }
                r += dr[dir];
                c += dc[dir];
            }
            for (int i = 0; i < N; i++) {
                for (int e: map[i]) {
                    System.out.print(e + " ");

                }
                System.out.println();
            }
        }

    }
}
