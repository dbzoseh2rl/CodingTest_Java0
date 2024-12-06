package text.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ_1138 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] tall = new int[N + 1]; // 키 정보를 저장할 배열
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N; i++) {
            tall[i] = Integer.parseInt(st.nextToken());
        }

        // 정답 리스트
//        LinkedList<Integer> ans = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        // 거꾸로 탐색하며 리스트에 삽입
        for (int i = N; i >= 1; i--) {
            ans.add(tall[i], i);
        }
        System.out.println(ans);
        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int k : ans) {
            sb.append(k).append(" ");
        }
        System.out.println(sb);
    }
}
