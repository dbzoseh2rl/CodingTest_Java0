package text.bronze;

import java.util.Scanner;

public class BOJ_24079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if((x + y) * 60 <= z * 60 + 30) {
            System.out.println("1");
        }else {
            System.out.println("0");
        }
        sc.close();
    }
}
