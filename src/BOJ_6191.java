import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.function.BiPredicate;

/**
 * 5 8
 * ..*...**
 * .*.*.**
 * ...*...
 * .*.*.*.
 * ....*.*.
 */

public class BOJ_6191 {
    static int r, c;
    static char[][] map;
    static boolean[][] v;
    static BiPredicate<Integer, Integer> isMovable = (o1, o2) -> o1 < 0 || o1 >= r || o2 < 0 || o2 >= c || map[o1][o2] == '*' || v[o1][o2];

    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        map = new char[r][c];
        for (int i = 0; i < r; i++) {
            System.arraycopy(br.readLine().toCharArray(), 0, map[i], 0, c);
        }

        for (int[] df : dfs()) {
            bw.append(String.valueOf(df[0] + 1)).append(" ").append(String.valueOf(df[1] + 1)).append("\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }

    //    int[] dy = {0, 0, 1, -1};
    //    int[] dx = {1, -1, 0, 0};
    static int[][] direction = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    private static LinkedList<int[]> dfs() {
        LinkedList<Node> q = new LinkedList<>();

        LinkedList<int[]> step = new LinkedList<>();
        step.add(new int[]{0, 0});
        q.add(new Node(0, 0, step));
        v = new boolean[r][c];
        v[0][0] = true;

        while (!q.isEmpty()) {
            Node nextNode = q.poll(); // {y, x}
            for (int[] ints : direction) {
                int ny = nextNode.y + ints[0];
                int nx = nextNode.x + ints[1];
                if (isMovable.test(ny, nx) || v[ny][nx]) continue;
                nextNode.moving.add(new int[]{ny, nx});
                if (ny == r - 1 && nx == c - 1) return nextNode.moving;
                q.add(new Node(ny, nx, nextNode.moving));
                v[ny][nx] = true;
            }
        }
        return null;
    }

    static class Node {
        int y;
        int x;
        LinkedList<int[]> moving;

        public Node(int y, int x, LinkedList<int[]> moving) {
            this.y = y;
            this.x = x;
            this.moving = moving;
        }
    }
}
