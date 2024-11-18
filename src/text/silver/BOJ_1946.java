package text.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N+1];
            StringTokenizer st;
            for(int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                int a=Integer.parseInt(st.nextToken());
                int b=Integer.parseInt(st.nextToken());
                arr[a] = b;

            }
            int vot = arr[1];
            int cnt=1;

            for (int i = 2; i <= N; i++) {
                if (arr[i] < vot) {
                    vot = arr[i];
                    cnt++;
                }
            }

            System.out.println(cnt);
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        for (int tc = 0; tc < T; tc++) {
            int N = Integer.parseInt(br.readLine()); // 지원자 수
            Map<Integer, Integer> map = new HashMap<>(); // 서류순위 -> 면접순위 저장

            // 지원자 입력
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                int document = Integer.parseInt(st.nextToken());
                int interview = Integer.parseInt(st.nextToken());
                map.put(document, interview);
            }

            // 서류 순위를 기준으로 정렬 (TreeMap으로 정렬된 Map 생성)
            TreeMap<Integer, Integer> sortedMap = new TreeMap<>(map);

            // 선발된 지원자 수 계산
            int count = 0;
            int minInterviewRank = Integer.MAX_VALUE; // 면접 순위의 초기 기준은 최대값

            for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
                int interviewRank = entry.getValue();
                // 현재 면접 순위가 기준보다 낮으면 선발
                if (interviewRank < minInterviewRank) {
                    count++;
                    minInterviewRank = interviewRank; // 면접 순위 기준 갱신
                }
            }

            // 결과 출력
            System.out.println(count);*/
        }
    }
}


/*
1
5
3 2
1 4
4 1
2 3
5 5
*/