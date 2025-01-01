package text.deepdive_study;

import java.util.Arrays;

public class programmus_연속된부분수열의합 {
    public static void main(String[] args) {
        Integer[] sequence = {1, 2, 3, 4, 5};
        int k = 7;
        System.out.println(Arrays.toString(solution(sequence, k)));
    }

    public static int[] solution(Integer[] sequence, int k) {
        int N = sequence.length;
        int left = 0, right = N;
        int sum = 0;

        for (int L = 0, R = 0; L < N; L++) {
            while (R < N && sum < k) {
                sum += sequence[R++];
                System.out.println(sum);
            }

            if(sum == k) {
                int range = R - L - 1;
                if((right - left) > range) {
                    left = L;
                    right = R - 1;
                }
            }

            sum -= sequence[L];
        }
        int[] answer = {left, right};
        return answer;
    }
}
