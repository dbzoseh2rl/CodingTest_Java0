package text.silver;

import java.io.*;
import java.util.*;

public class BOJ_2238 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Map<Integer, String> hashMap = new HashMap<>();
        Set<Integer> cntSet = new HashSet<>();

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        // 가격에 대한 빈도수 찾아야됨 빈도에 배열을 하나 만들어야됨
        // 카운팅된 배열에서 최빈값을 탐색 처음에는 최솟값을찾고, 만약에 5가 3번이면 브레이크 찍고 5에대한 처음사람을 출력해야됨
        for (int i = 0; i < B; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            String name = st2.nextToken();
            int cnt = Integer.parseInt(st2.nextToken());

            System.out.println(name + " " + cnt);

            if (false) {
                cntSet.remove(cnt);
                hashMap.remove(cnt);
            } else {
                cntSet.add(cnt);
                hashMap.put(cnt, name);
            }

        }

        bw.flush();
        bw.close();
    }
}


//
//테스트 입력 예시:
//10 4
//Lew 10
//CD 5
//Fe 5
//CD 7
//
//엣지 케이스
//15 14
//Lew 10
//CD 5
//Fe 5
//CD 7
//CD 3
//CD 2
//LS 2
//JS 7
//IS 2
//IC 2
//JP 4
//LE 4
//QW 5




