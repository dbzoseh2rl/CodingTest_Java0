package text.bronze;

import java.util.Scanner;

public class BOJ_9773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); // 버퍼 비움

        for (int t = 0; t < T; t++) {
            String id = sc.nextLine();

            // 자릿수별로 모두 더하기
            int ans = 0;
            for (char ch : id.toCharArray()) {
                if (Character.isDigit(ch)) {
                    ans += ch - '0';
                }
            }

            // id의 11번째 자리 이후를 정수로 변환해 10 곱하기
            if (id.length() > 10) {
                ans += Integer.parseInt(id.substring(10)) * 10;
            }

            // 조건별로 출력
            if (ans > 9999) {
                System.out.println(String.format("%04d", ans % 10000));
            } else if (ans < 1000) {
                System.out.println(ans + 1000);
            } else {
                System.out.println(ans);
            }
        }
    }
}
