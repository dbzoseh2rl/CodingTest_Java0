package text.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 0; i < 7; i++) {
            if((N &(1<< i)) > 0) cnt ++;
            int z = N & (1<< i);
            System.out.println(z);
        }
        /*
        int[] map = new int[]{1, 2, 4, 8, 16, 32, 64};
        int cnt = 0;

        // 뒤에서 부터 탐색함
        for (int i = map.length - 1; i >= 0; i--) {
            if (N >= map[i]) {  // 23 >= 64
                N -= map[i];
                cnt++;
            }
            if (N == 0) break;
        }
        */

        System.out.println(cnt);
    }

}
