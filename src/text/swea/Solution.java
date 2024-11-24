package text.swea;

import java.io.*;
import java.util.*;


public class Solution {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        for (int tc = 1; tc <= T; tc++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            Deque<Integer> deque = new ArrayDeque<>();
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                deque.addLast(Integer.parseInt(st.nextToken()));
            }
            System.out.println(deque);
            Set<String> seen = new HashSet<>(); // 이전 상태 저장
            int operations = 0;
            boolean allEqual = false;

            while (true) {
                String currentState = deque.toString();

                if (seen.contains(currentState)) {
                    System.out.println("#" + tc + " -1");
                    break;
                }

                // 저장
                seen.add(currentState);
                System.out.println(seen);

                Iterator<Integer> iter = deque.iterator();
                System.out.println(deque);

                int first = iter.next();
                allEqual = true;
                while (iter.hasNext()) {
                    if (iter.next() != first) {
                        allEqual = false;
                        break;
                    }
                }
                if (allEqual) {
                    System.out.println("#" + tc + " " + operations);
                    break;
                }
                operations++;
                int kthElement = getKthElement(deque, K); // K번째 원소
                System.out.println(getKthElement(deque,K));
                deque.addLast(kthElement);
                deque.pollFirst();
            }
        }
    }

    private static int getKthElement(Deque<Integer> deque, int k) {
        Iterator<Integer> iter = deque.iterator();
        for (int i = 1; i < k; i++) {
            iter.next();
        }
        return iter.next();
    }
}
