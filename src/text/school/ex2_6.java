package text.school;

import java.io.*;
import java.util.Scanner;

public class ex2_6 {
    public static void main(String[] args) throws IOException {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("나이를 입력하세요>> ");
        int age = Scanner.nextInt();

        if (age <= 0) {
            System.out.println("나이는 양수로만 입력하세요. ");
        } else {
            int r = age / 10;
            age %= 10;

            int b = age / 5;
            age %= 5;

            int y = age;

            System.out.printf("빨간초 %d개, 파란초 %d개, 노란초 %d개. 총 %d개가 필요합니다.", r, b, y, r + b + y);
        }
    }
}
