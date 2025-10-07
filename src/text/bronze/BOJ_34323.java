package text.bronze;

import java.util.Scanner;
public class BOJ_34323 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int S = sc.nextInt();

        int N_Percent = S * (M + 1) * (100 - N) / 100;
        int M_Plus_One = S * M;

        System.out.println(Math.min(N_Percent, M_Plus_One));
    }
}
