package text.swea.D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_2046 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
//        System.out.println("#".repeat(a));
        for (int i = 0; i < a; i++) {
            System.out.print("#");
        }
    }
}
