package text.silver.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_3187 {
    static char[][] map;
    static int R,C,k,v,wolf,sheep;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new char[R][C];
        visited = new boolean[R][C];

        // 이차원 배열 초기화
        for (int i = 0; i < R; i++) {
            String a = br.readLine();
            for (int j = 0; j < C; j++) {
                map[i][j] = a.charAt(j);
                if (map[i][j] != '#') { // #이 아닐때 즉, 갈수잇는 길일때
                    visited[i][j] = true;
                }
            }
        }
//        System.out.println(Arrays.deepToString(map));
//        System.out.println(Arrays.deepToString(visited));

        //오른쪽으로 한칸씩 읽은 다음에 v나 k가 나오면 dfs를 돌려서
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (visited[i][j]) {
                    k = 0;
                    v = 0;
                    dfs(i, j);
//                    System.out.println("********************");
                    if (k > v) {
                        sheep += k;
                    } else {
                        wolf += v;
                    }
//                    System.out.println("sheep:"+sheep + " " +"wolf:"+ wolf);
                }
            }
        }
        System.out.println(sheep + " " + wolf);
    }
    public static void dfs(int y , int x) {
        // 현재 위치가 True인데 Flase로 바뀜
        visited[y][x] = false;
        if (map[y][x] == 'k') {
            k++;
//            System.out.println(1);
        }
        if (map[y][x] == 'v') {
            v++;
//            System.out.println(2);
        }
        // k나 v가 있는곳에서 4방향 탐색 해주는 for문
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
//            System.out.println(nx + " " + ny);
            //배열안에 있는지 체크 해줌
            if (nx >= 0 && nx < C && ny >= 0 && ny < R) {
                // 갈수있는(다음노드가) 방향이 True면 돌아간다.
                if (visited[ny][nx]) {
                    dfs(ny, nx);
                }
            }
        }
    }
}
