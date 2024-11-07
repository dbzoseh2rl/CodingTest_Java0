package text.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_1215 {
    static int N, cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int tc = 1; tc <= 10; tc++) {
            N = Integer.parseInt(br.readLine());
            cnt = 0;
            // 행
            char[][] row = new char[8][8];
            for (int i = 0; i < 8; i++) {
                String input = br.readLine();
                check(input);
                for (int j = 0; j < 8; j++) {
                    row[i][j] = input.charAt(j);
                }
            }
//            System.out.println(Arrays.deepToString(row));
            // 열
            for (int j = 0; j < 8; j++) {
                String s = "";
                for (int i = 0; i < 8; i++) {
                    s += row[i][j];
                }
                // 체크
                check(s);
            }
            System.out.println("#" + tc + " " + cnt);
        }
    }

    public static void check(String input) {
        StringBuilder sb;
        for (int i = 0; i <= 8 - N; i++) {
            String sp = input.substring(i, i + N);
            sb = new StringBuilder(sp);
//            System.out.println(sb);
            if (sp.equals(sb.reverse().toString())) {
                cnt++;
            }

        }
//        System.out.println(cnt);
    }


}
