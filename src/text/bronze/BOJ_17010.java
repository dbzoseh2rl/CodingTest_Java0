package text.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_17010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st2.nextToken());
            String b = st2.nextToken();

            // 두 번째 토큰이 문자열인 경우, 반복 출력
            for (int j = 0; j < a; j++) {
                System.out.print(b);
            }
            System.out.println();
        }
    }
}
