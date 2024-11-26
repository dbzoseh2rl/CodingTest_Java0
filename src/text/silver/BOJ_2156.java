package text.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ_2156 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int e = Integer.parseInt(br.readLine());
            list.add(e);
        }

        if (N == 0) {
            System.out.println(0); // 빈 리스트일 경우
            return;
        }

        if (N == 1) {
            System.out.println(list.get(0)); // 잔이 하나만 있을 경우
            return;
        }

        // DP 배열 초기화
        int[] dp = new int[N];
        dp[0] = list.get(0);
        dp[1] = list.get(0) + list.get(1);
        dp[2] = Math.max(dp[1], Math.max(list.get(0) + list.get(2), list.get(1) + list.get(2)));

        // 점화식으로 DP 배열 채우기
        for (int i = 3; i < N; i++) {
            dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2] + list.get(i), dp[i - 3] + list.get(i - 1) + list.get(i)));
        }


        // 결과 출력
        System.out.println(dp[N - 1]);
    }
}
