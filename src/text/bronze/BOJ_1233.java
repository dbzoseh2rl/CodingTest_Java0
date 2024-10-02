package text.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1233 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] sumCount = new int[a + b + c + 1];

        for (int i = 1; i < a+1; i++) {
            for (int j = 1; j < b+1; j++) {
                for (int k = 1; k < c+1; k++) {
                    int sum = i + j + k;
                    sumCount[sum]++;
                }
            }
        }

        int max = 0;
        int result = 0;

        for (int i = 3; i < sumCount.length; i++) {
            if (sumCount[i] > max) {
                max = sumCount[i];
                result = i;
            }
        }
        System.out.println(result);
        br.close();

    }
}
