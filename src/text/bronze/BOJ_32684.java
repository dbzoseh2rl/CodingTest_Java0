package text.bronze;

import java.util.Scanner;

public class BOJ_32684 {

    public static int janggi(int[] x) {
        int result = 0;
        int[] point = {13, 7, 5, 3, 3, 2};
        for (int i = 0; i < 6; i++) {
            result += x[i] * point[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[6];  // 척이
        int[] B = new int[6];  // 은규

        for (int i = 0; i < 6; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            B[i] = sc.nextInt();
        }

        int A_Point = janggi(A);
        double B_Point = janggi(B) + 1.5;

        if (A_Point > B_Point) {
            System.out.println("cocjr0208");
        } else {
            System.out.println("ekwoo");
        }

        sc.close();
    }
}
