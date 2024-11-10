package text.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_5215 {
    static int maxScore;
    static int N, L;
    static int[] T, K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());

        for (int t = 1; t <= TC; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            L = Integer.parseInt(st.nextToken());

            T = new int[N];
            K = new int[N];

            // 입력으로 T와 K 배열 초기화
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                T[i] = Integer.parseInt(st.nextToken());
                K[i] = Integer.parseInt(st.nextToken());
            }

            maxScore = 0;
            combination(0, 0, 0);
            System.out.println("#" + t + " " + maxScore);
        }
    }

    // 조합으로 최대 점수를 찾는 함수
    private static void combination(int index, int currentScore, int currentCalories) {
        // 칼로리가 L을 넘으면 종료
        if (currentCalories > L) {
            return;
        }

        // 모든 재료를 탐색했으면 최대 점수를 업데이트
        maxScore = Math.max(maxScore, currentScore);

        // 조합 탐색
        for (int i = index; i < N; i++) {
            combination(i + 1, currentScore + T[i], currentCalories + K[i]);
        }
    }
}
