package text.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class swea_9940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());

        for (int k = 1; k <= TC; k++) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 배열 초기화
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
//            System.out.println(Arrays.toString(arr));
            Arrays.sort(arr);

            boolean result = true;
            for (int i = 0; i < N - 1; i++) {
                if (arr[i] == arr[i + 1]) {
                    result = false;
                    break;
                }
            }

            System.out.println(result ? "#" + k + " " + "Yes":"#" + k + " " + "No");
        }
    }
}
