package text.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_17210 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long A = Long.parseLong(br.readLine());
        long B = Integer.parseInt(br.readLine());

        if (A > 5) {
            System.out.println("Love is open door");
        } else {
            for (int i = 0; i < A - 1; i++) {
                if (B == 1) {
                    System.out.println("0");
                    B = 0;
                } else {
                   System.out.println("1");
                   B = 1;
               }
            }
        }
    }
}

