package text.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_11315 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int k = 1; k <= T; k++) {
            int N = Integer.parseInt(br.readLine());
            char[][] arr = new char[N][N];

            for (int i = 0; i < N; i++) {
                String input = br.readLine();
                for (int j = 0; j < N; j++) {
                    arr[i][j] = input.charAt(j);
                }
            }

            String result = "NO";
            outerLoop:
            for (int i = 0; i < N; i++) { // row
                for (int j = 0; j < N; j++) { // column
                    // Check horizontal (left to right)
                    if (j <= N - 5 && arr[i][j] == 'o' && arr[i][j + 1] == 'o' && arr[i][j + 2] == 'o' && arr[i][j + 3] == 'o' && arr[i][j + 4] == 'o') {
                        result = "YES";
                        break outerLoop;
                    }
                    // Check vertical (top to bottom)
                    if (i <= N - 5 && arr[i][j] == 'o' && arr[i + 1][j] == 'o' && arr[i + 2][j] == 'o' && arr[i + 3][j] == 'o' && arr[i + 4][j] == 'o') {
                        result = "YES";
                        break outerLoop;
                    }
                    // Check diagonal (top-left to bottom-right)
                    if (i <= N - 5 && j <= N - 5 && arr[i][j] == 'o' && arr[i + 1][j + 1] == 'o' && arr[i + 2][j + 2] == 'o' && arr[i + 3][j + 3] == 'o' && arr[i + 4][j + 4] == 'o') {
                        result = "YES";
                        break outerLoop;
                    }
                    // Check diagonal (top-right to bottom-left)
                    if (i <= N - 5 && j >= 4 && arr[i][j] == 'o' && arr[i + 1][j - 1] == 'o' && arr[i + 2][j - 2] == 'o' && arr[i + 3][j - 3] == 'o' && arr[i + 4][j - 4] == 'o') {
                        result = "YES";
                        break outerLoop;
                    }
                }
            }
            System.out.println("#"+k+" "+ result);
        }
    }
}
