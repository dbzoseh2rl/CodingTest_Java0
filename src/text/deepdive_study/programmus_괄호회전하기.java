package text.deepdive_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class programmus_괄호회전하기 {
    static class Solution {
        public boolean solution(String s) {
            int cnt = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    cnt++;
                } else if (s.charAt(i) == ')') {
                    cnt--;
                }
                if (cnt < 0) {
                    return false;
                }
            }
            return cnt == 0;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("문자열 입력: ");
        String input = br.readLine();

        Solution solution = new Solution();
        boolean result = solution.solution(input);

        System.out.println("올바른 괄호 여부: " + result);
    }
}
