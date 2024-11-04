package text.swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_13218 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for (int i = 1; i <= tc; i++) {
            int N = Integer.parseInt(br.readLine());
            System.out.println("#"+i+" "+N/3);
        }
    }
}
