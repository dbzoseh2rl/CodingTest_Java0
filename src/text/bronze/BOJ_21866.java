package text.bronze;// 코드 리펙토링 해보기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_21866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] score = new int[9];
        int total = 0;
        int cnt = 0;

        for (int i = 0; i < score.length; i++) {
            score[i] = Integer.parseInt(br.readLine());
            total += score[i];
        }

        if (total < 100) {
            System.out.print("none");
        } else {
            if (cnt > 0) {
                System.out.print("hacker");
            } else {
                System.out.print("draw");
            }
        }


        /*     // 줄이는 방법 == dp로 점화식 활용해서
        int[] score = {100, 100, 200, 200, 300, 300, 400, 400, 500};
        int total = 0;
        int cnt = 0;

        for (int i = 0; i < score.length; i++) {
            int student = Integer.parseInt(st.nextToken());
            total += student;
            if (student > score[i]) {
                cnt++;
            }
        }

        if (total < 100) {
            System.out.print("none");
        } else {
            if (cnt > 0) {
                System.out.print("hacker");
            } else {
                System.out.print("draw");
            }
        }*/
    }
}