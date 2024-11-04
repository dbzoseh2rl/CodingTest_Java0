package text.swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_2072 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;
            for (int j = 1; j <= 10; j++) {
                int a = Integer.parseInt(st.nextToken());

                if (a % 2 == 1) {
                    sum += a;
                }
            }
            System.out.println("#" + i +" " + sum);
        }

    }
}
/*
3
3 17 1 39 8 41 2 32 99 2
22 8 5 123 7 2 63 7 3 46
6 63 2 3 58 76 21 33 8 1
*/