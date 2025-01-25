package text.bronze;
import java.util.Scanner;
import java.util.Arrays;

public class BOJ_5246 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();

            while (T-- > 0) {
                int[] board = new int[9]; // 배열 초기화
                Arrays.fill(board, 0); // 배열 값 초기화

                int N = sc.nextInt();
                int A = 0;

                for (int i = 0; i < N; i++) {
                    int X = sc.nextInt();
                    int Y = sc.nextInt();
                    board[Y]++;
                }

                for (int i = 1; i <= 8; i++) {
                    A = Math.max(A, board[i]);
                }

                System.out.println(A);
            }

            sc.close();
    }
}
