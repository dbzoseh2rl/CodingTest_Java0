package text.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_G3_10986_나머지합 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        long[] sum = new long[n];
        int[] mode = new int[m];
        st = new StringTokenizer(br.readLine());
        long ans = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        sum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i - 1] + arr[i];
        }

        for (int i = 0; i < n; i++) {
            int modeNum = (int) (sum[i] % m);
            if (modeNum == 0) ans++;
            mode[modeNum]++;
        }

        for (int i = 0; i < m; i++) {
            ans += (long) mode[i] * (mode[i] - 1) / 2;
        }

        System.out.println(ans);
    }

}
