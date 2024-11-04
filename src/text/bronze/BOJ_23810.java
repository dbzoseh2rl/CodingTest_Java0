package text.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_23810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        pattern(n, 5 * n);
        pattern(n, n);
        pattern(n, 5 * n);
        pattern(2 * n, n);
    }

    public static void pattern(int row, int col){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }

        /*for (int i = 0; i < n; i++) {
            System.out.println("@".repeat(5 * n));
        }

        for (int i = 0; i < n; i++) {
            System.out.println("@".repeat(n));
        }

        for (int i = 0; i < n; i++) {
            System.out.println("@".repeat(5 * n));
        }

        for (int i = 0; i < n; i++) {
            System.out.println("@".repeat(n));
        }

        for (int i = 0; i < n; i++) {
            System.out.println("@".repeat(n));
        }*/
        

}
