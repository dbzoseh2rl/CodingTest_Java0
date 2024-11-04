package text.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class swea_13038 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());

        for (int k = 1; k <= TC; k++) {
            int[] arr = new int[7];
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 7; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            System.out.println(Arrays.toString(arr));
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < 7; i++) {
                if (arr[i] == 0)
                    continue;
                int count = 0;
                int start = i;
                while (true) {
                    if (arr[start % 7] == 1)
                        count++;
                    start++;
                    if (count == N) {
                        min = Math.min(min, start - i);
                        break;
                    }
                }
            }
        }
    }
}

