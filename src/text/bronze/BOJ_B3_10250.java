package text.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B3_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine()); // 테스트 케이스 개수 입력

        while (TC-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int H = Integer.parseInt(st.nextToken()); // 호텔의 층 수
            int W = Integer.parseInt(st.nextToken()); // 각 층의 방 개수 (사용되지 않음)
            int N = Integer.parseInt(st.nextToken()); // N번째 손님

            int floor = (N % H == 0) ? H : (N % H); // 층 번호
            int room = (N % H == 0) ? (N / H) : (N / H) + 1; // 방 번호

            System.out.println(floor * 100 + room);
        }
    }
}
