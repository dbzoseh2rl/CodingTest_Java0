package text.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_30802 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] Tshirt = new int[6];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            Tshirt[i] = Integer.parseInt(st.nextToken());
        }

        int t = Integer.parseInt(br.readLine());
        int p = Integer.parseInt(br.readLine());

        int cnt = 0;
        for(int i = 0; i < 6; i++) {
            cnt += Tshirt[i] / t;
            if(Tshirt[i] % t != 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
        System.out.println(N / p + " " + N % p);

    }
}
