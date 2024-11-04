package text.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_28061 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] x = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = Integer.parseInt(st.nextToken());

        }
//        System.out.println(Arrays.toString(x));

        int ans = 0;
        for (int i = 0; i < N; i++) {
            int tmp = x[i] - (N - i);
            ans = Math.max(ans, tmp);
        }

        System.out.println(ans);
    }
}
