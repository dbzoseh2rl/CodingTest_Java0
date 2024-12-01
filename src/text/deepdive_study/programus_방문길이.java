package text.deepdive_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class programus_방문길이 {
    static int[][] map;
    static boolean[][] visited;
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String dir = br.readLine();
        System.out.println(dir);

        // 2차원배열 초기화
        map = new int[10][10];



    }
}
