package text.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_31868 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int waterCount = 1;
        int answer = 0;

        for (int i = 1; i < N; i++) {
            waterCount *= 2;
        }

        while (K >= waterCount){
            K -= waterCount;
            answer++;
        }

        System.out.println(answer);
    }
}
