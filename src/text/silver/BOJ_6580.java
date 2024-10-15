package text.silver;

public class BOJ_6580 {
    public static void main(String[] args) {
        // 1. 쿼드트리 알고리즘 = 분할정복 문제이다.
        // 먼저 이차원배열 만들어야됨

        /*        // 1
        System.out.println(0xf0); // 240 -> 11110000
        System.out.println(0x0f); //  15 -> 1111

        // 2: Integer를 String Binary로 바꾼다
        System.out.println(Integer.toBinaryString(0xf0));*/

        // 3
        // 11110000 1111
        // n = 16 / 8 = 2
        // 그리고 다음 n줄에는 사진 한줄의 픽셀값이 n/8개의 헥사값로 변환되어 입력된다.
        // 0xf0,0x0f,

        // 4
        // 8자리 맞춘 애를 2차원 배열에 삽입

        // 4-1.
        // 단 뒤집어서 삽입해야 됨ㅋ
        // 응? 답이랑 tc랑 다르노?
        // B가 1이네?
        // 158
        // 10011110
        // WBBBBWWB = 0x9e = 158 = 10011110
        // WBBBBWWB = 10011110
        // BWWBBBBW = 10011110
        // 10011110
        // 01111001 = 10011110

        // 5.
        // 완성한 2차원 배열로 쿼드트리 타면 됨
        // QQWBBWQWBBWQWBBWQWBBW

        // 0000
        // 0000
        // 0000
        // 0000
        }
}
