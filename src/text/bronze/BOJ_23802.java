package text.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_23802 {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        final int atCnt = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        // 골뱅이의 수만큼의 줄은 골뱅이의 수 곱하기 5만큼 출력
        final int atCntTemp1 = atCnt * 5;
        for (int i = 0; i < atCnt; i++) {
            sb.append("@".repeat(atCntTemp1)).append("\n");
        }

        // 골뱅의의 수 곱하기 4만큼의 줄은 골뱅이의 수만큼 출력
        final int atCntTemp2 = atCnt * 4;
        for (int i = 0; i < atCntTemp2; i++) {
            sb.append("@".repeat(atCnt)).append("\n");
        }

        // 출력
        sb.setLength(sb.length() - 1);
        System.out.print(sb);
    }
}
