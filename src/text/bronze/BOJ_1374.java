package text.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ_1374 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        PriorityQueue<Clazz> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.from));
        PriorityQueue<Integer> remainingTime = new PriorityQueue<>();

        int size = Integer.parseInt(br.readLine());
        for (int i = 0; i < size; i++) {
            st = new StringTokenizer(br.readLine());
            pq.add(new Clazz(Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())));
        }

        int ans = 1;
        remainingTime.add(pq.poll().to);
        while (!pq.isEmpty()) {
            Clazz clz = pq.poll();
            if (clz.from < remainingTime.peek()) ans++;
            else remainingTime.poll();
            remainingTime.add(clz.to);
        }
        System.out.println(ans);
    }

    public static class Clazz {
        int number;
        int from;
        int to;

        public Clazz(int number, int from, int to) {
            this.number = number;
            this.from = from;
            this.to = to;
        }
    }

}

