package text.bronze;

import java.util.Scanner;

public class BOJ_11257 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 테스트 케이스 수

        while (t-- > 0) {
            int testerNum = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int totalScore = a + b + c;

            System.out.print(testerNum + " " + totalScore + " ");
            if (totalScore >= 55 && a >= 11 && b >= 8 && c >= 12) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }
        }

        sc.close();
    }
}
