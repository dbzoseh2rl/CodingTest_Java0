package text.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_17614 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int TC = Integer.parseInt(br.readLine());
        int cnt = 0;
        int check = 0;

        for (int i = 1; i <= TC; i++) {
            check = i;
            while (check != 0) {
                if (check % 10 == 3 || check % 10 == 6 || check % 10 == 9) cnt ++;
                check /= 10;
            }
        }
        System.out.println(cnt);
    }
}
