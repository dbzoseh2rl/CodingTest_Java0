package text.deepdive_study;

import java.io.IOException;

public class programmus_카드뭉치 {
    public static void main(String[] args) throws IOException {
        Solution a = new Solution();

        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        System.out.println(a.solution(cards1, cards2, goal));

        String[] cards1b = {"i", "water", "drink"};
        String[] cards2b = {"want", "to"};
        String[] goalb = {"i", "want", "to", "drink", "water"};
        System.out.println(a.solution(cards1b, cards2b, goalb));
    }

    static class Solution {
        public String solution(String[] cards1, String[] cards2, String[] goal) {
            int idx1 = 0;
            int idx2 = 0;

            for (String currentStr : goal) {
                if (idx1 < cards1.length && currentStr.equals(cards1[idx1])) {
                    idx1++; // cards1[idx1]에 포함하는 경우 idx1 증가
                } else if (idx2 < cards2.length && currentStr.equals(cards2[idx2])) {
                    idx2++; // cards2[idx2]에 포함하는 경우 idx2 증가
                } else {
                    return "No";
                }
            }
            return "Yes";
        }
    }
}
