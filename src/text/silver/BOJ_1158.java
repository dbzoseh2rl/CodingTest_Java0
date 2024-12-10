package text.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        ArrayDeque<Integer> deque =new ArrayDeque<>();

        for (int i = 1; i <= N; i++) {
            deque.add(i);
        }
        sb.append("<");

        while (!deque.isEmpty()) {
            for (int i = 1; i < K; i++) { // 앞에 두개 뒤로 밀어줌
                deque.add(deque.poll());
            }
            sb.append(deque.poll()); // 첫번째 제거
            if (!deque.isEmpty()) {
                sb.append(", ");
            }
        }

        sb.append(">");
        System.out.println(sb);
    }
}
