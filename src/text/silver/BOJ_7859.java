package text.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_7859 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());
        int[][] map = new int[TC][TC];

        for (int i = 0; i < TC; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < TC; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int result = 0;

        for (int y = 0; y < TC; y++) {
            int sum = 0;
            for (int x = 0; x < TC; x++) {
                sum += map[y][x];
            }
            result= Math.max(result, sum);
        }

        System.out.println(result);
    }
}
