package text.school;

import java.util.Scanner;

public class ex2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("생일 입력 하세요 (형식: yyyymmdd) >> ");

        int date = input.nextInt();

        int year = date / 10000;          // 연도 추출
        int month = (date % 10000) / 100; // 월 추출
        int day = date % 100;             // 일 추출

        System.out.println(year + "년 " + month + "월 " + day + "일");

    }
}


