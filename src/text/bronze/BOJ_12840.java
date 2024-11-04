package text.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_12840 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(br.readLine());
        int cur = (3600 * h + 60 * m + s) % 86400;
        System.out.println(cur);
        int h1 = 0;
        int m1 = 0;
        int s1 = 0;

        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken());

            if (c == 1) {
                int d = Integer.parseInt(st.nextToken());
                cur = (cur + d) % 86400;
                if (cur < 0) cur += 86400;
                System.out.println(cur);
            } else if (c == 2) {
                int d = Integer.parseInt(st.nextToken());
                cur = (cur - d) % 86400;
                if (cur < 0) cur += 86400;
                System.out.println(cur);
            } else if (c == 3) {
                h1 = (cur / 3600) % 24;
                m1 = (cur / 60) % 60;
                s1 = cur % 60;
                System.out.println(h1 + " " + m1 + " " + s1);
            }
        }
    }
}
