package text.silver;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

import static text.silver.BOJ_1260.sb;

public class BOJ_11286 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\dbzos\\OneDrive\\바탕 화면\\CodingTest\\src\\input.txt"));

        int N = Integer.parseInt(br.readLine());
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input != 0) {
                // x가 0이 아니면 리스트에 추가
                list.add(input);
            } else {
                if (list.isEmpty()) {
                    sb.append(0).append("\n"); // 배열이 비어 있으면 0 출력
                } else {
                    // 절댓값이 가장 작은 값 찾기
                    int minIndex = 0;
                    for (int j = 1; j < list.size(); j++) {
                        int currentAbs = Math.abs(list.get(j));
                        int minAbs = Math.abs(list.get(minIndex));

                        if (currentAbs < minAbs || (currentAbs == minAbs && list.get(j) < list.get(minIndex))) {
                            minIndex = j;
                        }
                    }
                    // 결과 저장 및 제거
                    sb.append(list.get(minIndex)).append("\n");
                    list.remove(minIndex);
                }
            }
        }
        System.out.println(sb);
    }
}

