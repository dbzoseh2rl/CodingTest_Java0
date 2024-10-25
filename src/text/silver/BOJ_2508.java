package text.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2508 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());
        for (int k = 0; k < TC; k++) {
            br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            char[][] arr = new char[a][b];

            // 이차원배열 초기화
            for (int i = 0; i < a; i++) {
                String s1 = br.readLine();
                for (int j = 0; j < b; j++) {
                    arr[i][j] = s1.charAt(j);
                }
            }
//            System.out.print(Arrays.deepToString(arr));

            int cnt = 0;
            // 사탕찾는걸 이제 돌려야됨
            for (int i = 0; i < a; i++) { //열
                for (int j = 0; j < b; j++) { //행
                    if (j > 0 && j < b - 1 && arr[i][j] == 'o' && arr[i][j - 1] == '>' && arr[i][j + 1] == '<') {
                        cnt++;
                    }
                    if (i > 0 && i < a - 1 && arr[i][j] == 'o' && arr[i - 1][j] == 'v' && arr[i + 1][j] == '^') {
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }

    }
}
