package text.school;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int result = 1;
            for (int i = 1; i <= N; i++) {
                result = result * (M - i + 1) / i;
            }
            System.out.println(result);
        }
    }



    /*public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int x = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
        for (int t = 0; t < x; t++) {
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);

            // DP 배열 생성
            int[][] dp = new int[m + 1][n + 1];

            // 조합 값 계산
            for (int i = 0; i <= m; i++) {
                for (int j = 0; j <= Math.min(i, n); j++) {
                    if (j == 0 || i == j) {
                        dp[i][j] = 1; // nC0 = 1, nCn = 1
                    } else {
                        dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                    }
                }
            }
            sb.append(dp[m][n]).append("\n");
        }
        System.out.print(sb); // 결과 출력
    }*/

    /*public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int x = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
        for (int i = 0; i < x; i++) {
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            System.out.println(Arrays.toString(input));
            sb.append(combination(m, n)).append("\n");
        }

        System.out.print(sb); // 결과 출력
    }

    // 조합 계산 함수 (nCr)
    public static BigInteger combination(int m, int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 0; i < n; i++) {
            result = result.multiply(BigInteger.valueOf(m - i))
                    .divide(BigInteger.valueOf(i + 1));
        }
        return result;
    }*/
}
