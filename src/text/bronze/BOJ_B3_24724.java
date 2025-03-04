package text.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B3_24724 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // 부품의 개수

        for(int i = 1; i <= T; i++) {
            int N = Integer.parseInt(br.readLine());

            StringTokenizer st= new StringTokenizer(br.readLine(), " ");

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            System.out.println("Material Management " + i);
            for(int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine(), " ");

                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
            }

            System.out.println("Classification ---- End!");
        }
    }
}
