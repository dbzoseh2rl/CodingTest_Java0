package text.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_7859 {
    static int N;
    static int[][] map;
    static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, new int[N]);
        System.out.println(max);
    }

    static void dfs(int idx, int[] selected) {
        if (idx == N) {
            /*for (int i = 0; i < N; i++) {
                System.out.print(selected[i] + " ");  // 0 또는 1로 출력
            }
            System.out.println();*/
            int Sum = 0;
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    if ((selected[i] == 0 && selected[j] == 1) || (selected[i] == 1 && selected[j] == 0)) {
                        Sum += map[i][j];
                    }
                }
            }
            if (Sum > max) {
                max = Sum;
            }
            return;
        }

        // 노드를 그룹 A(0)에 포함시키는 경우
        selected[idx] = 0;
        dfs(idx + 1, selected);

        // 노드를 그룹 B(1)에 포함시키는 경우
        selected[idx] = 1;
        dfs(idx + 1, selected);
    }
}
