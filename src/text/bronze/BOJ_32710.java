package text.bronze;

import java.util.Scanner;

public class BOJ_32710 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sign = 0;

        for (int i = 1; i < 10; i++) {
            if (N % i == 0 && N / i <= 9) {
                sign = 1;
                break;
            }
        }

        if (sign == 0) {
            System.out.println('0');
        } else {
            System.out.println('1');
        }
    }
}
