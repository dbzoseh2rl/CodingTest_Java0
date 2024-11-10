package text.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class swea_5948 {
    static Set<Integer> sums;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());

        for (int t = 1; t <= TC; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] map = new int[7];
            boolean[] visited = new boolean[map.length];
            sums = new TreeSet<>();

            for (int i = 0; i < 7; i++) {
                map[i] = Integer.parseInt(st.nextToken());
            }

            comb1(map, visited, 0, 3);

            // TreeSet에서 상위 5번째 큰 값을 출력
            Integer[] sortedSums = sums.toArray(new Integer[0]);
//            System.out.println(Arrays.toString(sortedSums));
            System.out.println("#" + t + " " + sortedSums[sortedSums.length - 5]);
        }
    }

    public static void comb1(int[] map, boolean[] visited, int start, int r) {
        if (r == 0) {
            int sum = calculateSum(map, visited);
            sums.add(sum);
            return;
        } else {
            for (int i = start; i < map.length; i++) {
                visited[i] = true;
                comb1(map, visited, i + 1, r - 1);
                visited[i] = false;
            }
        }
    }

    public static int calculateSum(int[] map, boolean[] visited) {
        int sum = 0;
        for (int i = 0; i < map.length; i++) {
            if (visited[i]) {
                sum += map[i];
            }
        }
        return sum;
    }
}
