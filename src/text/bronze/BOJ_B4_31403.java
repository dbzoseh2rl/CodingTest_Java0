package text.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B4_31403 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        String a = Integer.toString(A);
        int B = Integer.parseInt(br.readLine());
        String b = Integer.toString(B);
        int C = Integer.parseInt(br.readLine());

        System.out.println((A + B) - C);
        String ab = a + b;
        System.out.println(Integer.parseInt(ab) - C);

    }
}
