package text.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10991 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            for (int j = i; j < count - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
