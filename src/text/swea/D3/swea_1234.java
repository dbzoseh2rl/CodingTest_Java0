package text.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class swea_1234 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int t = 1; t <= 10; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int TC = Integer.parseInt(st.nextToken());
            String input = st.nextToken();

            List<Integer> map = new ArrayList<>();
            for (int i = 0; i < input.length(); i++) {
                map.add(Integer.parseInt(String.valueOf(input.charAt(i))));
            }
//            System.out.println(map);
            int i = 0;
            while (i < map.size() - 1) {
                if (map.get(i).equals(map.get(i + 1))) {
                    map.remove(i);
                    map.remove(i);
                    if (i > 0) i--; // 이전 위치로 돌아가 다시 비교
                } else {
                    i++;
                }
            }
            System.out.print("#" + t + " ");
            for (int num : map) {
                System.out.print(num);
            }
            System.out.println();
        }

    }

}
