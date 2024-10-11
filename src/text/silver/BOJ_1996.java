package text.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1996{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        // 1. 2차원 배열 선언 및 초기화
        char[][] map = new char[N][N];
        char[][] result = new char[N][N];

        // 2. 입력 처리
        for (int i = 0; i < N; i++) {
            map[i] = br.readLine().toCharArray();
        }

        // 3. 주변 지뢰 수 계산 및 결과 저장
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == '.') {
                    int count = solution(map, i, j, N);
//                    System.out.print(count + " ");
                    if (count >= 10) {
                        result[i][j] = 'M';
                    }else{
                        result[i][j] = (char) (count + '0');
                    }
//                    System.out.print(count + " ");
                }else{
                    result[i][j] = '*';
                }
            }
        }
//        System.out.println(Arrays.deepToString(result));
        for (int i = 0; i < N; i++) {
            System.out.println(result[i]);
        }

    }

    // 4. 팔방탐색
    public static int solution(char[][] map, int x, int y, int N) {
        int[] dx = {-1, 0, 1, -1, 1, -1, 0, 1};
        int[] dy = {-1, -1, -1, 0, 0, 1, 1, 1};
        int count = 0;

        for (int k = 0; k < 8; k++) {
            int nx = x + dx[k];
            int ny = y + dy[k];
            if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
                if (map[nx][ny] != '.') {
                    count += map[nx][ny] - '0';
                }
            }
        }
        return count;
    }
}
