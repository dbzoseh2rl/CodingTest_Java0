/*
package text.silver.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_15900 {
    static boolean[][] map;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        map = new boolean[N + 1][N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i < N - 1 ; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a][b] = true;
            map[b][a] = true;

        }
//        System.out.println(Arrays.deepToString(map));
        // true체크된 2차원 배열을 dfs돌린다.
        dfs(1, 0);
        // dfs에서  dfs(

    }

    static void dfs(int node, int depth) {
        visited[node] = true;

        for (int i = 1; i < ; i++) {

        }
    }
}
*/
