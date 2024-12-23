package text.deepdive_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Programmus_짝지어제거하기 {
    public static void main(String[] args) throws IOException {
        Solution a = new Solution();
        System.out.println(a.solution("baabaa"));

        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        ArrayList<Character> map = new ArrayList<>();
        for (int i = 0; i < a.length(); i++) {
            map.add(a.charAt(i));
        }
//        System.out.println(map);
        int i = 0;
        while (i < map.size() - 1) {
            if (map.get(i).equals(map.get(i + 1))) {
                map.remove(i);
                map.remove(i);
                if (i > 0) i--;     // 이전 위치로 돌아가 다시 비교
            } else {
                i++;                // 연속된 문자가 아니라면 다음으로 이동
            }
        }
//        System.out.println(map);
        System.out.println(map.isEmpty() ? 1 : 0);*/
    }
}
class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            // 스택맨위, 현재 비교해서 같으면 pop 아니면 push
            if (!stack.isEmpty() && stack.peek() == current) {
                stack.pop();
            } else {
                stack.push(current);
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}
