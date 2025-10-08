package text.bronze;

import java.util.Scanner;

public class BOJ_34346 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        if (N % 2 == 1) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }
}
