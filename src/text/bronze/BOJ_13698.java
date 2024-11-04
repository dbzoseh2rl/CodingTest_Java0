package text.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_13698 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int[] ball = {1, 0, 0, 2};  // 1: 작은 공, 2: 큰 공

        for (int i = 0; i < input.length(); i++) {
            char T = input.charAt(i);
            switch (T) {
                case 'A': swap(ball, 0, 1); break;
                case 'B': swap(ball, 0, 2); break;
                case 'C': swap(ball, 0, 3); break;
                case 'D': swap(ball, 1, 2); break;
                case 'E': swap(ball, 1, 3); break;
                case 'F': swap(ball, 2, 3); break;
            }
        }

        int smallBallPosition = 0;
        int bigBallPosition = 0;

        for (int i = 0; i < ball.length; i++) {
            if (ball[i] == 1) {
                smallBallPosition = i + 1;  // 작은 공 위치
            }
            if (ball[i] == 2) {
                bigBallPosition = i + 1;  // 큰 공 위치
            }
        }

        System.out.println(smallBallPosition);
        System.out.println(bigBallPosition);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
