package text.bronze;
import java.util.Scanner;

public class BOJ_15701 {

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            long N = sc.nextLong();
            sc.close();

            int count = 0;

            for (long i = 1; i * i <= N; i++) {
                if (N % i == 0) {
                    if (i * i == N) count += 1;   // a == b 인 경우 (한 쌍만)
                    else count += 2;              // (a, b), (b, a)
                }
            }

            System.out.println(count);
        }
    }
}
