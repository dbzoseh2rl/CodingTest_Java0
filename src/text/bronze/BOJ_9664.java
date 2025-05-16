package text.bronze;

import java.util.Scanner;

public class BOJ_9664 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daughter = scanner.nextInt();
        int remainMedal = scanner.nextInt();
        scanner.close();

        int di = remainMedal / (daughter - 1);
        int minAns = remainMedal + di;

        if (remainMedal - di * (daughter - 1) == 0) {
            System.out.println((minAns - 1) + " " + minAns);
        } else {
            System.out.println(minAns + " " + minAns);
        }
    }
}

