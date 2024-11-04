package text.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11970 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int[] li = {a, b, c, d};
        int max = 0;
        for (int i = 0; i < li.length; i++) {
            max = customMax(max, li[i]);
        }
        System.out.println(max);


 /*       int min =
        int max = Math.max(Math.max(a, b), Math.max(c, d));
        System.out.println(d < a || b < c ? (b - a) + (d - c) : max - min);
*/
/*        if (d < a || b < c) {
            ans = (b - a) + (d - c);
        } else {
            ans = max - min;
        }
        System.out.println(ans);*/
    }

    public static int customMax(int a, int b) {
        return a >= b ? a : b;
    }
}
