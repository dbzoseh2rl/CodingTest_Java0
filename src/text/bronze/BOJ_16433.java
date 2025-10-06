package text.bronze;

import java.util.Scanner;

public class BOJ_16433 {
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int N = sc.nextInt();
            int R = sc.nextInt();
            int C = sc.nextInt();

            char[][] field = new char[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    field[i][j] = '.';
                }
            }

            field[R - 1][C - 1] = 'v';

            boolean sameParity = (R + C) % 2 == 0;

            for (int row = 0; row < N; row++) {
                if (sameParity) {
                    // 행이 짝수 → 짝수 열
                    if (row % 2 == 0) {
                        for (int column = 0; column < N; column += 2) {
                            field[row][column] = 'v';
                        }
                    } else {
                        // 행이 홀수 → 홀수 열
                        for (int column = 1; column < N; column += 2) {
                            field[row][column] = 'v';
                        }
                    }
                } else {
                    // 행이 짝수 → 홀수 열
                    if (row % 2 == 0) {
                        for (int column = 1; column < N; column += 2) {
                            field[row][column] = 'v';
                        }
                    } else {
                        // 행이 홀수 → 짝수 열
                        for (int column = 0; column < N; column += 2) {
                            field[row][column] = 'v';
                        }
                    }
                }
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(field[i][j]);
                }
                System.out.println();
            }
        }
    }
}
