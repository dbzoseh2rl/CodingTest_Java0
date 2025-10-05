package text.bronze;

import java.util.Scanner;
public class BOJ_15947 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String[] song = {
                "baby", "sukhwan", "tururu", "turu",
                "very", "cute", "tururu", "turu",
                "in", "bed", "tururu", "turu",
                "baby", "sukhwan"
        };

        int cnt = N % 14 - 1;
        if (cnt == -1) cnt = 13; // N이 14의 배수일 때 인덱스 조정

        String word = song[cnt];

        // turu가 포함되지 않으면 그대로 출력
        if (!word.contains("turu")) {
            System.out.println(word);
        } else {
            // 'ru' 반복 개수 추가
            int repeat = N / 14;
            StringBuilder rst = new StringBuilder(word);
            for (int i = 0; i < repeat; i++) {
                rst.append("ru");
            }

            int ruNum = (int) (rst.length() - rst.toString().replace("ru", "").length()) / 2;

            // 'ru'가 5번 이상이면 축약 형태로 출력
            if (ruNum >= 5) {
                System.out.println("tu+ru*" + ruNum);
            } else {
                System.out.println(rst);
            }
        }
    }
}

