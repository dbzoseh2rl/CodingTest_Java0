package text.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class BOJ_2161 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque1 = new ArrayDeque<>();

        for (int i = 1; i <= N; i++) {
            deque1.add(i);
        }

        while (deque1.size() != 1) {
            System.out.print(deque1.poll().toString() + " ");
            deque1.add(deque1.poll());
        }
        System.out.print(deque1.poll());
    }
}
