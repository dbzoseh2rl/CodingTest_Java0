package text.silver;

import java.io.*;
import java.util.StringTokenizer;

/*
3 5
42101
22100
22101
*/

public class BOJ_1051 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];

        // 직사각형 값 입력
        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split("");  // 문자열을 각 문자별로 나눔
            /*System.out.println(Arrays.toString(line));*/
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(line[j]);  // 문자를 숫자로 변환하여 배열에 저장
            }
        }

        int maxSize = Math.min(N, M);  // 최대 정사각형 크기 - 정사각이므로 작은 길이보다 클수없음

        // 정사각형 크기를 줄여가며 탐색
        for (int size = maxSize; size > 1; size--) {
            for (int i = 0; i <= N - size; i++) {
                for (int j = 0; j <= M - size; j++) {
                    // 4개의 꼭짓점이 모두 같은지 확인
                    if (arr[i][j] == arr[i + size - 1][j] &&
                            arr[i][j] == arr[i][j + size - 1] &&
                            arr[i][j] == arr[i + size - 1][j + size - 1]) {

                        // 조건을 만족하는 최대 정사각형 넓이 출력
                        bw.append(String.valueOf((size * size))).append("\n");
                        bw.flush();
                        bw.close();
                        br.close();
                        return;
                    }
                }
            }
        }

        // 탐색에서 못 찾았을 경우 1x1 정사각형 넓이 출력
        bw.write("1\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
