package text.deepdive;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ex_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫째 줄 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        // 둘째 줄 입력
        st = new StringTokenizer(br.readLine());
        int[] diceFaces = new int[N];
        for (int i = 0; i < N; i++) {
            diceFaces[i] = Integer.parseInt(st.nextToken());
        }

        // 최소, 최대 값을 구하기 위해 정렬
        Arrays.sort(diceFaces);
        int minFace = diceFaces[0];           // 최소 면 값
        int maxFace = diceFaces[N - 1];       // 최대 면 값

        // 최소 횟수 계산
        int minRolls = (int) Math.ceil((double) T / maxFace);

        // 최대 횟수 계산
        int maxRolls = (int) Math.ceil((double) T / minFace);

        // 결과 출력
        System.out.println(minRolls + " " + maxRolls);
    }
}


