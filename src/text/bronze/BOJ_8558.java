package text.bronze;

import java.util.Scanner;

public class BOJ_8558 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 1;

        for (int i = 1; i <= n; i++) {
            ans *= i;
            ans %= 10;
        }

        System.out.println(ans);
        sc.close();
    }

}
