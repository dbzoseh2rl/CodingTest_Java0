package text.bronze;
import java.util.Scanner;

public class BOJ_16600 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        double result = Math.sqrt(a);
        result = result * 4;

        System.out.println(result);
        sc.close();
    }
}