package text.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_28097 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine()); // 계획의 수
        int sumTime = (n - 1) * 8; // 총 쉬는 시간은 계획의 수 - 1이다.

        // 공부 시간
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            sumTime += Integer.parseInt(st.nextToken());
        }

        // 일 + 시간 출력
        sb.append(sumTime / 24).append(" ").append(sumTime % 24);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
