package text.school;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex2_9 {
    public static void main(String[] args) throws IOException {
        System.out.print("점 (x,y)의 좌표를 입력하시오>>");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        // 경계 조건을 먼저 확인
        if ((x == 10 || x == 200) && (10 <= y && y <= 300) ||
                (y == 10 || y == 300) && (10 <= x && x <= 200)) {
            System.out.print("(" + x + "," + y + ")는 사각형 선 상에 있습니다.");
        }
        // 사각형 안에 있는 경우
        else if (10 < x && x < 200 && 10 < y && y < 300) {
            System.out.print("(" + x + "," + y + ")는 사각형 안에 있습니다.");
        }
        // 사각형 밖에 있는 경우
        else {
            System.out.print("(" + x + "," + y + ")는 사각형 밖에 있습니다.");
        }
    }
}
