package text.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_30804 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] fruits = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            fruits[i] = Integer.parseInt(st.nextToken());
        }

        int left = 0;
        int right = 0;
        int maxLength = 0;
        int[] cnt = new int[9];
        int uniqueFruits = 0;

        while (right < N) {
            // 현재 right 포인터가 가리키는 과일의 카운트를 증가
            if (cnt[fruits[right] - 1] == 0) {
                uniqueFruits++;  // 새로운 과일 종류가 등장했으므로 종류 개수 증가
            }
            cnt[fruits[right] - 1]++;

            // 고유 과일 종류가 2를 초과하면 left 포인터를 이동시켜 윈도우 축소
            while (uniqueFruits > 2) {
                cnt[fruits[left] - 1]--;
                if (cnt[fruits[left] - 1] == 0) {
                    uniqueFruits--;  // 더 이상 해당 과일이 없으므로 종류 개수 감소
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }

        System.out.println(maxLength);
    }
}
